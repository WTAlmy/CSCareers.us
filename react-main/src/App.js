import React from 'react';
import './App.css';

import Nav from './components/Nav';
import Projects from './components/Projects';
import Companies from './components/Companies';
import Resumes from './components/Resumes';
import SampleLogin from './components/SampleLogin';

import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'; 

function App() {
  return (
    <Router> 
      <div className="App">
        <Nav />
        <Switch>
          <Route path="/" exact component={Home}/>
          <Route path="/companies" component={Companies}/>
          <Route path="/projects" exact component={Projects}/>
          <Route path="/resumes" component={Resumes}/>
          <Route path="/sampleLogin" component={SampleLogin}/>
        </Switch>
      </div>
    </Router>
  );
}

const Home = () => {
  return (
    <div>
      <h1>Home</h1>
    </div>
  );
}

export default App;
