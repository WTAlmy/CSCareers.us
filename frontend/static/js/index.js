alert("Hello world!");
fetch('http://34.68.104.62:8090/projects/list')
  .then(response => response.json())
  .then(data => console.log(data));