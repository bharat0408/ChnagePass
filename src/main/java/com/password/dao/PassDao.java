package com.password.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class PassDao {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int changePass(String password) {
		String sql = "update register set login_password =? where user_id = ? ";
		return jdbcTemplate.update(sql);
	}
}
