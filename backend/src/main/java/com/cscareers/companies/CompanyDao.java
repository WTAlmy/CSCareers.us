package com.cscareers.companies;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Company company) {
		String sql = "";
		jdbcTemplate.update(sql);
	}
	
    public List<Company> loadAll() {
        return jdbcTemplate.query("SELECT * FROM company_data", (resultSet, i) -> {
            return toCompany(resultSet);
        });
    }
    
    private Company toCompany(ResultSet resultSet) throws SQLException {
    	
        Company company = new Company();
        
        company.setId(resultSet.getInt("id"));
        company.setName(resultSet.getString("name"));
        company.setImageUrl(resultSet.getString("image_url"));
        
        company.setTotalAll(resultSet.getInt("all_total"));
        company.setTotalGrad(resultSet.getInt("grad_total"));
        company.setAvgGpa(resultSet.getDouble("avg_gpa"));
        company.setAvgYear(resultSet.getDouble("avg_year"));
        company.setAvgPrior(resultSet.getDouble("avg_prior"));
        
        return company;
    }
	
}
