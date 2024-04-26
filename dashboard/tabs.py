from os import path
from dash import dcc
import dash_bootstrap_components as dbc
import pandas as pd
import plotly.express as px
import plotly.graph_objects as go

import json

from pandas import DataFrame

repo_data_path = path.abspath(path.join(path.dirname(__file__), '..'))

y_labels = {
    'LD': 'Levenshtein Distance',
    'CodeBLEU': 'CodeBLEU'
}


def load_json_data(file_path) -> DataFrame:
    print(f"Loading data from {file_path}")
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
    csv_data['LD'] = None
    csv_data['CodeBLEU'] = None

    for bug_name in csv_data['Bug Name'].unique():
        json_data = load_json_data(bug_name)
        csv_data = csv_data.merge(json_data, on='Bug ID', how='left')

    return csv_data


def create_scatter_plot(df, x, y, bug_name):
    print(df)
    df = df.sort_values(by=[x])
    print(f"Sorted: {df}")

    fig = px.scatter(df, x=x, y=y, color='Bug ID', trendline="ols", labels={'x': x, 'y': y})

    fig.update_layout(transition_duration=500)
    return fig


def make_tab(bug_name):
    df = load_csv_data()
    df = df[df['Bug Name'] == bug_name]
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
