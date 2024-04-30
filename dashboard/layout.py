from dash import html
import dash_bootstrap_components as dbc

from dashboard.tabs import make_tab

tab_names = [
    "Bears",
    "BugSwarm",
    "Defects4J",
    "QuixBugs",
]

header = dbc.Row([
    html.Div(
        [
            html.H2("Dataset Metrics Dashboard", className="text-center mb-0"),
            html.H5("TEAM-9", className="text-center mb-0"),
        ],
        className="align-self-center mt-3",
    ),
],
    align="center",
)

main_content = dbc.Container(
    [
        header,
        html.Hr(),
        dbc.Tabs(
            id="tabs",
            children=[make_tab(group) for group in tab_names],
        ),
    ],
    className="flex justify-content-between align-items-center",
    fluid=True,
)
