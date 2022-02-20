import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ComponenteListarUsuario from './components/ComponenteListarUsuario';
import ComponenteCabacalho from './components/ComponenteCabacalho';
import ComponenteRodape from './components/ComponenteRodape';
import ComponenteCriarUsuario from './components/ComponenteCriarUsuario';
import ComponenteAtualizarUsuario from './components/ComponenteAtualizarUsuario';
import ComponenteVisualizarUsuario from './components/ComponenteVisualizarUsuario';

function App() {
  return (
    <div>
        <Router>
              <ComponenteCabacalho />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ComponenteListarUsuario}></Route>
                          <Route path = "/users" component = {ComponenteListarUsuario}></Route>
                          <Route path = "/add-user/:id" component = {ComponenteCriarUsuario}></Route>
                          <Route path = "/view-user/:id" component = {ComponenteVisualizarUsuario}></Route>
                          {/* <Route path = "/update-user/:id" component = {ComponenteAtualizarUsuario}></Route> */}
                    </Switch>
                </div>
              <ComponenteRodape />
        </Router>
    </div>
    
  );
}

export default App;
