package com.cscareers.companies;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String COMP_READ_SQL = "SELECT * FROM company_data";
	private final String COMP_DATA_SQL = "SELECT * FROM reported_data";
	private final String SAVE_SQL = "INSERT INTO reported_data(userId, companyId, accepted, GPA, college, collegeYear, previousInternships) VALUES (?, ?, ?, ?, ?, ?, ?)";
	private final String UPDATE_SQL = "UPDATE company_data SET allTotal = ?, acceptedTotal = ?, gradTotal = ?, avgGpa = ?, avgPrior = ?, avgYear = ? WHERE id = ?";
	
	public void update(Company company) {
		jdbcTemplate.update(UPDATE_SQL, company.getAllTotal(), company.getGradTotal(), company.getAcceptedTotal(), company.getAvgGpa(), company.getAvgPrior(), company.getAvgYear(), company.getId());
	}
	
	public void insert(DataReport report) {
		jdbcTemplate.update(SAVE_SQL, report.getUserId(), report.getCompanyId(), report.getAccepted(), report.getGPA(), report.getCollege(), report.getCollegeYear(), report.getPreviousInternships());
	}
	
    public List<Company> loadAll() {
        return jdbcTemplate.query(COMP_READ_SQL, (resultSet, i) -> {
            return toCompany(resultSet);
        });
    }
    
    public List<DataReport> loadReports() {
        return jdbcTemplate.query(COMP_DATA_SQL, (resultSet, i) -> {
            return toDataReport(resultSet);
        });
    }
    
    public List<DataReport> userReports(int userId) {
    	List<DataReport> all_reports = loadReports();
    	List<DataReport> user_reports = new ArrayList<DataReport>();
    	for (DataReport report : all_reports) {
    		if (report.getUserId() == userId) {
    			user_reports.add(report);
    		}
    	}
    	return user_reports;
    }
    
    public List<DataReport> companyReports(int companyId) {
    	List<DataReport> all_reports = loadReports();
    	List<DataReport> comp_reports = new ArrayList<DataReport>();
    	for (DataReport report : all_reports) {
    		if (report.getCompanyId() == companyId) {
    			comp_reports.add(report);
    		}
    	}
    	return comp_reports;
    }
    
    private Company toCompany(ResultSet resultSet) throws SQLException {
        Company company = new Company();
        company.setId(resultSet.getInt("id"));
        company.setName(resultSet.getString("name"));
        company.setImageUrl(resultSet.getString("imageUrl"));
        company.setAllTotal(resultSet.getInt("allTotal"));
        company.setGradTotal(resultSet.getInt("gradTotal"));
        company.setAcceptedTotal(resultSet.getInt("acceptedTotal"));
        company.setAvgGpa(resultSet.getDouble("avgGpa"));
        company.setAvgYear(resultSet.getDouble("avgYear"));
        company.setAvgPrior(resultSet.getDouble("avgPrior"));
        return company;
    }
    
    private DataReport toDataReport(ResultSet resultSet) throws SQLException {
    	DataReport report = new DataReport();
        report.setId(resultSet.getInt("id"));
        report.setUserId(resultSet.getInt("userId"));
        report.setCompanyId(resultSet.getInt("companyId"));
        report.setAccepted(resultSet.getInt("accepted"));
        report.setGPA(resultSet.getFloat("GPA"));
        report.setCollege(resultSet.getString("college"));
        report.setCollegeYear(resultSet.getInt("collegeYear"));
        report.setPreviousInternships(resultSet.getInt("previousInternships"));
    	return report;
    }
	
}
