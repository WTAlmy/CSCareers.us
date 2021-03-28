import React, { Component } from 'react'
import axios from 'axios'

class ResComment extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            userId: 1,
            resumeId: this.props.resumeId,
            commentText: '',
            username: 'charles_dickens',
            selectedFile: ''
        }
    }

    refreshPage = () => {
        window.location.reload(false);  
    }

    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value})
    }

    //var url =  + 1;
    submitHandler = (e) => {
        e.preventDefault()
        const commentUp = {
            username: this.state.username,
            commentText: this.state.commentText,
            resumeId: this.state.resumeId
        }
        console.log(commentUp);
        axios
            .post('http://34.68.104.62:8090/resumes/post/comment', commentUp)
            .then(response => {
                //this.setState({ resumeId: response.dat})
                console.log(response)
                this.refreshPage()
            })
            .catch(error => {
                console.log(error)
            })
    }
    
    render() {
        const { userId, resumeId, commentText, username } = this.state
        return (
            <div>
                <form onSubmit={this.submitHandler}>
                    <input type="text" name="commentText" value={commentText} placeholder="Enter a comment" onChange={this.changeHandler}/>
                    <input type="submit" value="submit"/> 
                </form>
            </div>
        )
    }
}

export default ResComment
