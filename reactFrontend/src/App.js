import React, {useState, useEffect} from 'react';
import Tweet from './Tweet';
import Project from './Project'
import "./App.css";

function App () {
  return (
    <div className="app">
      <h1>Hello World from App component</h1>
      <Project />
    </div>
  );
}

export default App;