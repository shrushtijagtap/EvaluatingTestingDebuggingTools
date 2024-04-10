from os import path
from dash import dcc, dash_table
from dash import html
import dash_bootstrap_components as dbc
import pandas as pd
import plotly.express as px
import plotly.graph_objects as go

import json

repo_data_path = path.abspath(path.join(path.dirname(__file__), '..'))

y_labels = {
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

        metrics_summary.append(entry)

    return metrics_summary


def create_box_plot(df, metric, y_label=""):
    if metric in ['LD', 'CodeBLEU']:
        fig = go.Figure()
        fig.add_trace(go.Box(y=df[metric], name=metric))
    else:
        fig = go.Figure()
        fig.add_trace(go.Box(y=df[metric], name=metric))
    fig.update_layout(
        title_x=0.5,
        yaxis_title=y_label,
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

    # metrics = ['LD R', 'LD E', 'CodeBLEU R', 'CodeBLEU E']

    randoopFailingTests = []
    evosuiteFailingTests = []
    
    if "Bears" in tab_name:
        randoopFailingTests = ["Bears-99", "Bears-141", "Bears-123"]
        evosuiteFailingTests = ["Bears-143", "Bears-246"]
    elif "BugSwarm" in tab_name:
        randoopFailingTests = []
        evosuiteFailingTests = []
    elif "Defects4J" in tab_name:
        evosuiteFailingTests = ["Chart_1", "Chart_4", "Compress_1", "Compress_3", "Compress_4", "Csv_2", "Gson_2", "Gson_4", "JacksonCore_1", "JacksonCore_2", "JacksonDatabind_2", "JacksonDatabind_3", "JacksonDatabind_4", "JacksonXml_4", "Jsoup_4", "JxPath_1", "JxPath_3", "Lang_5", "Math_1", "Math_3", "Math_4", "Mockito_2", "Time_1", "Time_2", "Time_4"]
        randoopFailingTests = ["Chart_4", "Codec_4", "Compress_1", "Compress_4", "JacksonCore_1", "JacksonCore_3", "JacksonXml_4", "Math_1", "Math_4", "Time_1", "Time_2"]
    elif "QuixBugs" in tab_name:
        randoopFailingTests = ['GCD', 'BUCKETSORT', 'KNAPSACK', 'LEVENSHTEIN', 'FIND_IN_SORTED', 'LIS', 'BREADTH_FIRST_SEARCH', 'POSSIBLE_CHANGE', 'SHORTEST_PATH_LENGTH', 'DEPTH_FIRST_SEARCH', 'FLATTEN', 'SIEVE', 'NEXT_PALINDROME', 'SHORTEST_PATHS', 'NEXT_PERMUTATION', 'REVERSE_LINKED_LIST', 'MERGESORT']
        evosuiteFailingTests = ['BUCKETSORT', 'LEVENSHTEIN', 'QUICKSORT', 'FIND_IN_SORTED', 'BREADTH_FIRST_SEARCH', 'POSSIBLE_CHANGE', 'LCS_LENGTH', 'SHORTEST_PATH_LENGTH', 'DEPTH_FIRST_SEARCH', 'FLATTEN', 'TO_BASE', 'SIEVE', 'NEXT_PALINDROME', 'IS_VALID_PARENTHESIZATION', 'SHORTEST_PATHS', 'SHUNTING_YARD', 'NEXT_PERMUTATION', 'REVERSE_LINKED_LIST', 'GET_FACTORS']

    
    df_metricsRandoopFailing = df_metrics[df_metrics['Bug ID'].isin(randoopFailingTests)]
    df_metricsRandoopOther = df_metrics[~df_metrics['Bug ID'].isin(randoopFailingTests)]
    df_metricsEvosuiteFailing = df_metrics[df_metrics['Bug ID'].isin(evosuiteFailingTests)]        
    df_metricsEvosuiteOther = df_metrics[~df_metrics['Bug ID'].isin(evosuiteFailingTests)]

    plots = []
    if "LD" in df_metricsRandoopFailing.columns:
        fig = create_box_plot(df_metricsRandoopFailing, "LD", 'Randoop Failing Tests LD')
        plots.append(dcc.Graph(figure=fig))

    if "CodeBLEU" in df_metricsRandoopFailing.columns:
        fig = create_box_plot(df_metricsRandoopFailing, "CodeBLEU", 'Randoop Failing Tests CodeBLEU')
        plots.append(dcc.Graph(figure=fig))

    if "LD" in df_metricsRandoopOther.columns:
        fig = create_box_plot(df_metricsRandoopOther, "LD", 'Randoop Other LD')
        plots.append(dcc.Graph(figure=fig))

    if "CodeBLEU" in df_metricsRandoopOther.columns:
        fig = create_box_plot(df_metricsRandoopOther, "CodeBLEU", 'Randoop Other CodeBLEU')
        plots.append(dcc.Graph(figure=fig))

    if "LD" in df_metricsEvosuiteFailing.columns:
        fig = create_box_plot(df_metricsEvosuiteFailing, "LD", 'Evosuite Failing Tests LD')
        plots.append(dcc.Graph(figure=fig))

    if "CodeBLEU" in df_metricsEvosuiteFailing.columns:
        fig = create_box_plot(df_metricsEvosuiteFailing, "CodeBLEU", 'Evosuite Failing Tests CodeBLEU')
        plots.append(dcc.Graph(figure=fig))

    if "LD" in df_metricsEvosuiteOther.columns:
        fig = create_box_plot(df_metricsEvosuiteOther, "LD", 'Evosuite Other LD')
        plots.append(dcc.Graph(figure=fig))

    if "CodeBLEU" in df_metricsEvosuiteOther.columns:
        fig = create_box_plot(df_metricsEvosuiteOther, "CodeBLEU", 'Evosuite Other CodeBLEU')
        plots.append(dcc.Graph(figure=fig))
    

    # plots = [dcc.Graph(figure=create_box_plot(df_metrics, metric)) for metric in metrics]

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
