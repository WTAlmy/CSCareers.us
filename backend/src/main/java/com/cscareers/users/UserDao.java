package com.cscareers.users;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user) {
		String sql = "";
		jdbcTemplate.update(sql);
	}
	
    public List<User> loadAll() {
        return jdbcTemplate.query("SELECT * FROM users", (resultSet, i) -> {
            return toUser(resultSet);
        });
    }
    
    private User toUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        //user.setPassword(resultSet.getString("password"));
        user.setGPA(resultSet.getFloat("GPA"));
        user.setCollege(resultSet.getString("college"));
        user.setCollegeYear(resultSet.getInt("college_year"));
        user.setPrevInternships(resultSet.getInt("previous_internships"));
        return user;
    }

}
