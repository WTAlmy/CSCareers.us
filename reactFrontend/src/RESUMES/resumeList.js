import React, {useState, useEffect} from 'react';
import ResComment from './ResumeCommentForm';
//import {CSSTransition} from 'react-transition-group';
import './Resumes.css';

function ResPost({id, fileUrl, username, title, description, datePosted}){
    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [comments, setComments] = useState([]);
  
    useEffect(() => {
      var url = "http://34.68.104.62:8090/resumes/list/comments?resumeId=" + id
      fetch(url) 
        .then(res => res.json())
        .then(
          (result) => {
            setIsLoaded(true);
            setComments(result);
          },
          (error) => {
            setIsLoaded(true);
            setError(error);
          }
        )
      }, [])
    
    var box = document.getElementById(id);
    var isOpen = false;
    const click = () => {
        isOpen = !isOpen;
        if (isOpen) {
            box.style.display = "inline-block";
        } else {
            box.style.display = "none";
        }
    };
    
    if (error) {
        return <div>Error: {error.message}</div>;
      } else if (!isLoaded) {
        return <div>Loading...</div>;
      } else {
    return(
        <div className="post">
            <button onClick={click}><span className="user">{username} </span><span className="date">{datePosted}<br /></span><span className="title">{title}<br /></span><span className="desc">{description}<br /></span></button> 
            <div className="box" id={id}>
                <iframe src={fileUrl} type="application/pdf" width="800px" height="1000px" />
                <div className="commentBox">
                <h3 className="commentHeader">Comments</h3>
                <ul className="comments">
                    {comments.map(comment => (
                        <li><span className="commentUser">{comment.username}</span>: {comment.commentText}<br/><span className="commentDate">{comment.datePosted}</span></li>
                    ))}
                </ul>
                <ResComment resumeId={id}/>
            </div>
                
            </div>
        </div>
    );
}
}

export default ResPost;