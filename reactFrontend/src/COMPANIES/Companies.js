import React, {useState, useEffect} from 'react';
import logo from './logo.svg';
import './App.css';

function Companies() {

  useEffect(() => {
    fetchItems();
  }, []);

  const [companies, setCompanies] = useState([]);

  const fetchItems = async() => {
    const data = await fetch("http://34.68.104.62:8090/companies/list");
    const companies = await data.json();
    console.log(companies)
    setCompanies(companies);
  }
  // Got a json with projects 

  return (
    <div className="companies-main-div">
      {companies.map(company => (
            <div className="company-object">
              <p key={company.id}><strong><img src={company.imageUrl} className="company-logo"></img></strong></p>
              <p key={company.id} className="company-title"><strong>{company.name}</strong></p>
              <div className="btns">
                <button className="btn-box">Accepted</button>
                <button className="btn-box">Rejected</button>
              </div>
              <div className="desc-box">
                <div className="company-description">
                  <p key={company.id}><strong>Applicants:</strong> {company.allTotal}</p>
                  {/* Insert Graduates Apploied here  */}
                  <p key={company.id}><strong>Accepted:</strong> {company.acceptedTotal}</p>
                  <p key={company.id}><strong>Avg GPA:</strong> {Math.round(company.avgGpa*100)/100}</p>
                  <p key={company.id}><strong>Acceptance Rate:</strong> {Math.round(company.acceptedTotal/company.allTotal*100)}%</p>
                </div>
                <div className="company-description">
                  <p key={company.id}><strong>Graduates Applied:</strong> {company.gradTotal}</p>
                  <p key={company.id}><strong>Avg Year Level:</strong> {Math.round(company.avgYear*100)/100}</p>
                  <p key={company.id}><strong>Prior Internships:</strong> {Math.round(company.avgPrior*100)/100}</p>
                  <p key={company.id}><strong>G. Acceptance Rate:</strong> {Math.round(company.acceptedTotal/company.allTotal*100)}%</p>
                </div>
              </div>
            </div>
          ))}
    </div>
  );
}

export default Companies;
