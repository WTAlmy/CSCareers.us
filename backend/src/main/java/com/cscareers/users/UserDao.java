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
	
	private final String LOAD_SQL = "SELECT * FROM users";
	private final String SAVE_SQL = "INSERT INTO users(username, password, GPA, college, collegeYear, previousInternships) VALUES (?, ?, ?, ?, ?, ?)";
	
	public void save(User user) {
		jdbcTemplate.update(SAVE_SQL, user.getUsername(), user.getPassword(), user.getGPA(), user.getCollege(), user.getCollegeYear(), user.getPreviousInternships());
	}
	
	public User login (String username, String password) {
		List<User> users = loadHidden();
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				user.setPassword("HIDDEN");
				return user;
			}
		}
		User user = new User();
		user.setId(-1);
		return user;
	}
	
	public User profile (String username) {
		List<User> users = loadAll();
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		User user = new User();
		user.setId(-1);
		return user;
	}
	
    public List<User> loadAll() {
        return jdbcTemplate.query(LOAD_SQL, (resultSet, i) -> {
        	User user = toUser(resultSet);
        	user.setPassword("HIDDEN");
            return user;
        });
    }
    
    public List<User> loadHidden() {
        return jdbcTemplate.query(LOAD_SQL, (resultSet, i) -> {
        	User user = toUser(resultSet);
            return user;
        });
    }
    
    private User toUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setGPA(resultSet.getFloat("GPA"));
        user.setCollege(resultSet.getString("college"));
        user.setCollegeYear(resultSet.getInt("collegeYear"));
        user.setPreviousInternships(resultSet.getInt("previousInternships"));
        return user;
    }

}
