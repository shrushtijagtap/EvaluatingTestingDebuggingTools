from os import path
from dash import dcc
import dash_bootstrap_components as dbc
import pandas as pd
import plotly.express as px
import plotly.graph_objects as go
from scipy.stats import spearmanr
import json

from pandas import DataFrame

repo_data_path = path.abspath(path.join(path.dirname(__file__), '..'))

y_labels = {
    'LD': 'Levenshtein Distance',
    'CodeBLEU': 'CodeBLEU'
}


def get_spearman_rank_correlation(df):
    df_clean = df.dropna(subset=['LD', 'AR', 'FR', 'CodeBLEU'])

    ld_ad_corr = spearmanr(df_clean['LD'], df_clean['AR'])
    #print(ld_ad_corr)
    ld_fr_corr = spearmanr(df_clean['LD'], df_clean['FR'])
    # print(ld_fr_corr)
    cb_ad_corr = spearmanr(df_clean['CodeBLEU'], df_clean['AR'])
    # print(cb_ad_corr)
    cb_fr_corr = spearmanr(df_clean['CodeBLEU'], df_clean['FR'])
    #print(cb_fr_corr)

    return {
        'LD_AR': ld_ad_corr[0],
        'LD_FR': ld_fr_corr[0],
        'CodeBLEU_AR': cb_ad_corr[0],
        'CodeBLEU_FR': cb_fr_corr[0]
    }


def load_json_data(file_path) -> DataFrame:
    file_path = f"{file_path}/results/benchmark_results.json"

    # If file does not exist, return empty list
    if not path.exists(file_path):
        print(f"File does not exist: {file_path}")
        return pd.DataFrame()

    with open(file_path, 'r') as file:
        data = json.load(file)

    metrics_summary = []

    for bug_id, metrics in data.items():
        entry = {'Bug ID': bug_id}
        for metric, values in metrics.items():
            if metric in ['LD', 'CodeBLEU']:
                numeric_values = [float(num) for _, num in values.items()]
                if numeric_values:  # Ensure there are numeric values
                    entry[metric] = sum(numeric_values) / len(numeric_values)
        metrics_summary.append(entry)

    return pd.DataFrame(metrics_summary)


def load_csv_data() -> DataFrame:
    csv_data = pd.read_csv(f"{repo_data_path}/BL-Results.csv")
    csv_data['LD'] = pd.NA
    csv_data['CodeBLEU'] = pd.NA

    numeric_columns = ['LD', 'CodeBLEU', 'AR', 'FR']
    for column in numeric_columns:
        csv_data[column] = pd.to_numeric(csv_data[column], errors='coerce')

    for bug_name in csv_data['Bug Name'].unique():
        json_data = load_json_data(bug_name)
        csv_data = pd.merge(csv_data, json_data[['Bug ID', 'LD', 'CodeBLEU']], on='Bug ID', how='left',
                            suffixes=('', '_json'))

        # Update the LD and CodeBLEU columns from the json data columns
        csv_data['LD'] = csv_data['LD'].combine_first(csv_data['LD_json'])
        csv_data['CodeBLEU'] = csv_data['CodeBLEU'].combine_first(csv_data['CodeBLEU_json'])

        # Drop the temporary json columns
        csv_data.drop(columns=['LD_json', 'CodeBLEU_json'], inplace=True)

    return csv_data


def create_scatter_plot(df, x, y, bug_name):
    df = df.sort_values(by=[x])
    df_clean = df.dropna(subset=['LD', 'CodeBLEU'])

    x_values = df_clean[x].tolist()
    y_values = df_clean[y].tolist()

    fig = px.scatter(x=x_values, y=y_values, trendline="ols", labels={'x': x, 'y': y})
    # fig = px.scatter(df_clean, x=x_values, y=y_values, color='Bug ID', trendline="ols", labels={'x': x, 'y': y})
    fig.update_layout(transition_duration=500)

    trendline_results = px.get_trendline_results(fig)
    r_value = trendline_results.iloc[0]["px_fit_results"].rsquared
    fig.add_annotation(x=0.5, y=1.1, xref="paper", yref="paper", text=f'R = {r_value:.2f}', showarrow=False)

    return fig


def make_tab(bug_name):
    df = load_csv_data()
    df = df[df['Bug Name'] == bug_name]
    spearman_correlation = get_spearman_rank_correlation(df)
    print(bug_name )
    print(spearman_correlation)
    plots = []
    metrics = [('LD', 'AR'), ('LD', 'FR'), ('CodeBLEU', 'AR'), ('CodeBLEU', 'FR')]
    for x_metric, y_metric in metrics:
        if x_metric in df.columns and y_metric in df.columns:
            fig = create_scatter_plot(df, x_metric, y_metric, bug_name)
            plots.append(dcc.Graph(figure=fig))

    return dbc.Tab(label=bug_name, children=[
        dbc.Row([
            dbc.Col(plots[i], width=6, className="mb-2 px-1") for i in range(2)
        ]),
        dbc.Row([
            dbc.Col(plots[i], width=6, className="mb-2 px-1") for i in range(2, 4)
        ])
    ])
