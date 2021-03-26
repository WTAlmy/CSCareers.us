import React, {useState, useEffect} from 'react';
import './App.css';

function Tweet({name, text, numLikes}) {
  return (
    <div className='tweet'>
      <h3>By: {name}</h3>
      <p>{text}</p>
      <h3>Likes: {numLikes}</h3>
    </div>
  );
}

export default Tweet;