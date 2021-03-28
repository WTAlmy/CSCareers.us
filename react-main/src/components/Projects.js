import React, {useState, useEffect} from 'react';
import './../Projects.css';
import ProjectForm from './CreateProject';

function Projects() {

  useEffect(() => {
    fetchItems();
  }, []);

  const [projects, setProjects] = useState([]);

  const fetchItems = async() => {
    const data = await fetch("http://34.68.104.62:8090/projects/list");
    const projects = await data.json();
    console.log(projects)
    setProjects(projects);
  }
  
  return (
      <div id="projects-return-parent-div" className="projects-main-div">
          <ProjectForm/>
          {projects.map(project => (
            <div className="project-object">
              <p key={project.id} className="project-title"><strong>{project.projectTitle}</strong></p>
              <p key={project.id} className="project-description">{project.projectDescription}</p>
              <p key={project.id} ><strong>Project Tags:</strong> {project.projectTags}</p>
              <p key={project.id}><strong>Looking For:</strong> {project.lookingForTags}</p>
              <p key={project.id}><strong>Join URL:</strong> {project.joinUrl}</p>
              <p key={project.id}><strong>Date Created:</strong> {project.dateCreated}</p>
            </div>
          ))}
      </div>
  );
}

export default Projects;