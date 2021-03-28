import './../App.css';
import { Link, withRouter } from 'react-router-dom';

function Nav() {

  const navStyle = {
    color: "white",
  };

  return (
    <nav>
        <h3>Logo</h3>
        <ul className="nav-links">
            <Link to='/companies' style={navStyle}><li>companies</li></Link>
            <Link to='/projects' style={navStyle}><li>projects</li></Link>
            <Link to='/resumes' style={navStyle}><li>resumes</li></Link>
            <Link to='/sampleLogin' style={navStyle}><li>sampleLogin</li></Link>
        </ul>
    </nav>
  );
}

export default Nav;