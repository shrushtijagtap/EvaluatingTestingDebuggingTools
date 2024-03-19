from os import path
from dash import dcc, dash_table
from dash import html
import dash_bootstrap_components as dbc
import pandas as pd
import plotly.express as px

import json

repo_data_path = path.abspath(path.join(path.dirname(__file__), '..'))

y_labels = {
    'CChange': '# Changed Classes',
    'MChange': '# Changed Methods',
    'LChange': '# Changed Lines',
    'CB': 'Cyclomatic complexity Bug',
    'CP': 'Cyclomatic complexity Fix',
    'CC': 'Complexity Change',
    'LD': 'Levenshtein Distance',
    'CodeBLEU': 'CodeBLEU'
}


def load_json_data(file_path) -> list:
    print(f"Loading data from {file_path}")
    file_path = f"{file_path}/results/benchmark_results.json"

    # If file does not exist, return empty list
    if not path.exists(file_path):
        print(f"File does not exist: {file_path}")
        return []

    with open(file_path, 'r') as file:
        data = json.load(file)

    metrics_summary = []

    for bug_id, metrics in data.items():
        entry = {'Bug ID': bug_id}
        for metric, value in metrics.items():
            if metric in ['LD', 'CodeBLEU']:
                entry[metric] = ', '.join([f'{num}' for file, num in value.items()])
            else:
                entry[metric] = value

        metrics_summary.append(entry)

    return metrics_summary


def create_box_plot(df, metric):
    if metric in ['LD', 'CodeBLEU']:
        df_metric = preprocess_special_metric(df, metric)
        fig = px.box(df_metric, y=metric, title=f'{metric}')
    else:
        fig = px.box(df, y=metric, title=f'{metric}')

    fig.update_layout(
        title_x=0.5,
        yaxis_title=y_labels.get(metric, ""),
    )
    return fig


def preprocess_special_metric(df, metric):
    # Expand string to value list
    df_expanded = df.copy()
    df_expanded[metric] = df[metric].apply(lambda x: [float(num) for num in x.split(', ')] if pd.notna(x) else [])

    rows = []
    for _, row in df_expanded.iterrows():
        bug_id = row['Bug ID']
        for value in row[metric]:
            rows.append({'Bug ID': bug_id, metric: value})
    df_metric = pd.DataFrame(rows)

    return df_metric


def make_tab(tab_name: str):
    # If tab name == Combined, combine data for all tabs
    print(f"Loading data for {tab_name}")

    if tab_name == 'Combined':
        # Load data for all tabs
        data = [load_json_data(f'{repo_data_path}/{tab}') for tab in ['Bears', 'BugSwarm', 'Defects4J', 'QuixBugs']]

        df_metrics = pd.concat([pd.DataFrame(tab_data) for tab_data in data])

    else:

        # Load json data
        data = load_json_data(f'{repo_data_path}/{tab_name}')

        # If no data is available, return empty tab
        if not data:
            return dbc.Tab(label=tab_name, children=[html.H1("No data available")])

        # Create pandas dataframe
        df_metrics = pd.DataFrame(data)

    metrics = ['CChange', 'MChange', 'LChange', 'LD', 'CB', 'CP', 'CC', 'CodeBLEU']

    plots = [dcc.Graph(figure=create_box_plot(df_metrics, metric)) for metric in metrics]

    # Arrange plots in rows of 2
    plots_layout = html.Div([
        dbc.Row(
            [dbc.Col(plot, width=6, className="mb-2 px-1") for plot in plots[i:i + 2]]
        ) for i in range(0, len(plots), 2)
    ])

    data_display = dash_table.DataTable(
        id='metrics-table' + tab_name,
        columns=[{"name": col, "id": col} for col in df_metrics.columns],
        data=df_metrics.to_dict('records'),
        sort_action="native",
    )

    tab_content = dbc.Row([
        html.Hr(),
        dbc.Col(html.Div(data_display, style={
            'overflowX': 'auto',
            'overflowY': 'auto',
            'maxHeight': '80vh',
        }), width=4),
        dbc.Col(html.Div(plots_layout, style={
            'overflowX': 'auto',
            'overflowY': 'auto',
            'maxHeight': '80vh',
        }), width=8),
    ])

    return dbc.Tab(label=tab_name, children=[tab_content])
