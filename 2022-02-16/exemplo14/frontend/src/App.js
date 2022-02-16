import React, { Component } from 'react';
import './App.css';
import Principal from './Principal';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import ListarClientes from './ListarClientes';
import EditarCliente from "./EditarCliente";

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Principal}/>
            <Route path='/clientes' exact={true} component={ListarClientes}/>
            <Route path='/clientes/:id' component={EditarCliente}/>
          </Switch>
        </Router>
    )
  }
}

export default App;