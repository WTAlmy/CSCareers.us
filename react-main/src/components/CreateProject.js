import React, {useState, useEffect, setState} from 'react';
import './../Projects.css';

class ProjectForm extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            // username: sessionStorage.getItem("username"),
            // userId: sessionStorage.getItem("userId"),
            //username: "devan99",
            userId: 2,
            projectTitle: "",
            projectDescription: "",
            projectTags: "",
            lookingForTags: "",
            joinUrl: ""
        };

        this.myChangeHandler.bind(this);
        this.mySubmitHandler.bind(this);
    }

    myChangeHandler = (event) => {
        let nam = event.target.name;
        let val = event.target.value;
        this.setState({[nam]: val});
    }
    
    mySubmitHandler = (event) => {
        console.log("A project was submited: " + JSON.stringify(this.state));
        event.preventDefault();
        fetch('http://34.68.104.62:8090/projects/post', {
            mode: "no-cors",
            method: 'POST',
            body: JSON.stringify(this.state)
            }).then(function (res) {
                if (res.ok) {
                  alert("Perfect! ");
                } else if (res.status == 401) {
                  alert("Oops! ");
                }
              }, function (e) {
                alert("Error submitting form!");
              });
    }
    
    render() {
        return (
            <main id="create-project-holder">
                <h2 id="create-project-header">Create a project</h2>
                <form id="create-project-form" onSubmit={this.mySubmitHandler}>
                    <input type="text" className="create-project-form-field" name="projectTitle" placeholder="Project Title" onChange={this.myChangeHandler}></input>
                    <input type="textarea" className="create-project-form-field" name="projectDescription" placeholder="Project Description" onChange={this.myChangeHandler}></input>
                    <input type="text" className="create-project-form-field" name="projectTags" placeholder="Project Tags" onChange={this.myChangeHandler}></input>
                    <input type="text" className="create-project-form-field" name="lookingForTags" placeholder="Looking For Tags" onChange={this.myChangeHandler}></input>
                    <input type="text" className="create-project-form-field" name="joinUrl" placeholder="Join URL" onChange={this.myChangeHandler}></input>
                    <input type="submit" className="create-project-form-submit" value="Create Project"></input>
                </form>
            </main>
        );
    }
}

export default ProjectForm;