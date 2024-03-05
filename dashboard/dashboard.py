from layout import layout, tab_names

import dash
import dash_bootstrap_components as dbc

app = dash.Dash(__name__, external_stylesheets=[dbc.themes.MORPH])
server = app.server
app.layout = layout

if __name__ == "__main__":
    # app.run_server(debug=True, host="0.0.0.0", port=8080)
    app.run_server(debug=False)