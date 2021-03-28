import React, {useState, useEffect} from "react";
import ResPost from "./resumeList";
import ResForm from "./ResumeForm"

function Resumes() {
  const [error, setError] = useState(null);
  const [isLoaded, setIsLoaded] = useState(false);
  const [resumes, setResumes] = useState([]);

  // this useEffect will run once
  useEffect(() => {
    fetch("http://34.68.104.62:8090/resumes/list/resumes")
      .then(res => res.json())
      .then(
        (result) => {
          setIsLoaded(true);
          setResumes(result);
        },
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
        <div className="page">
          <header>
            <h1> Welcome to the Resume Page</h1>
            <ResForm />
            </header>
          <div className="resBody">
            {resumes.map(resume => (
              <ResPost id={resume.id} fileUrl={resume.fileUrl} username={resume.username} title={resume.title} description={resume.description} datePosted={resume.datePosted}/>
            ))}
          </div>
        </div>
      );
    }
}

export default Resumes;