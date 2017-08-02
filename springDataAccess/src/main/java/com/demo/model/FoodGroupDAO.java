package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

// Registra como bean (Requiere el component-scan)
@Component("foodGroupDAO")
public class FoodGroupDAO {
	
	private JdbcTemplate myJdbcTemplate;
	
	public List<FoodGroup> getFoodGroups () {
		
		return myJdbcTemplate.query("select * from foodgroups", new RowMapper<FoodGroup>(){
			
			public FoodGroup mapRow (ResultSet rs, int rowNum)
				throws SQLException {
				
				FoodGroup fg = new FoodGroup ();
				
				fg.setId(rs.getInt("id"));
				fg.setName(rs.getString("name"));
				fg.setDescription(rs.getString("description"));
				
				return fg;
			}
		});
	}

	public JdbcTemplate getMyJdbcTemplate() {
		return myJdbcTemplate;
	}

	// Logra hacer el autowire porque es el unico DataSource 
	@Autowired
	public void setMyJdbcTemplate(DataSource ds) {
		
		
		this.myJdbcTemplate = new JdbcTemplate (ds);
	}

}
