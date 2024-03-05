import dash
import dash_bootstrap_components as dbc

from dashboard.layout import main_content

app = dash.Dash(__name__, external_stylesheets=[dbc.themes.MORPH])
server = app.server
app.layout = main_content

if __name__ == "__main__":
    app.run_server(debug=False)