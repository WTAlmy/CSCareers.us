import React, {useState, useEffect} from 'react';
import './App.css';

function Project() {

  const [error, setError] = useState(null);
  const [isLoaded, setIsLoaded] = useState(false);
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    fetch("http://34.68.104.62:8090/projects/list")
      .then(res => res.json())
      .then(
        (result) => {
          setIsLoaded(true);
          setProjects(result);
        },
        // Note: it's important to handle errors here
        // instead of a catch() block so that we don't swallow
        // exceptions from actual bugs in components.
        (error) => {
          setIsLoaded(true);
          setError(error);
        }
      )
  }, [])

  if (error) {
    return <div>Error: {error.message}</div>;
  } else if (!isLoaded) {
    return <div>Loading...</div>;
  } else {
    return (
          <div>
          {projects.map(project => (
            <div className="project">
              <p>Project Title: {project.projectTitle}</p>
              <p>User Id: {project.userId}</p>
              <p>Project title: {project.projectTitle}</p>
            </div>
          ))}
          </div>
        
    );
  }
}


export default Project;

