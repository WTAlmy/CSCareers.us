import React from 'react';

function Hello() {

  const sayHello = () => {
    console.log("Hello");
  };
  
  return (
    <div>
      <h3>This is the hello component</h3>
      <button onClick={sayHello}>Say Hello</button>
    </div>
  );
}

export default Hello;