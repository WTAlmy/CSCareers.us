import React, { Component } from 'react'
import axios from 'axios'

class ResForm extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            userId: 1,
            fileUrl: '',
            title: '',
            description: '',
            username: 'charles_dickens',
            selectedFile: ''
        }
    }
    
    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value})
    }

    fileHandler = (e) => {
        this.setState({selectedFile: e.target.files[0]})
    }

    refreshPage = () => {
        window.location.reload(false);  
    }

    onFileUpload = () => {
    
        // Create an object of formData
        const formData = new FormData();
      
        // Update the formData object
        formData.append(
          "image",
          this.state.selectedFile,
          this.state.selectedFile.name
        );
      
        // Details of the uploaded file
        console.log(this.state.selectedFile);
      
        // Request made to the backend api
        // Send formData object
        axios.post('https://cscareers-proj.uc.r.appspot.com/upload', formData)
            .then(response => {
                this.setState({ fileUrl: response.data})
                console.log(response)
            })
            //.then(response => )
            
            .catch(error => {
                console.log(error)
            })
      };
    
    submitHandler = (e) => {
        e.preventDefault()
        const resumeUp = {
            username: this.state.username,
            description: this.state.description,
            title: this.state.title,
            fileUrl: this.state.fileUrl
        }
        console.log(resumeUp);
        axios
            .post(url, resumeUp)
            .then(response => {
                console.log(response)
                this.refreshPage()
            })
            .catch(error => {
                console.log(error)
            })
    }

    render() {
        const { userId, fileUrl, title, description, username } = this.state
        return (
            <div>
                <h2>Need help with your resume?</h2>
                
                <input type="file" name="image" onChange={this.fileHandler}/><br/>
                <button onClick={this.onFileUpload}>UPLOAD YO FILE BITCH</button>
                
                <form onSubmit={this.submitHandler}>
                    <input type="text" name="title" placeholder="title" value={title} onChange={this.changeHandler}/><br/> 
                    <input type="text" name="description" placeholder="description" value={description} onChange={this.changeHandler}/><br/>
                    <input type="submit" value="enter info"/> 
                </form>
            </div>
        )
    }
}

export default ResForm
