package com.sample.DBcon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class JDBCtemplate implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	
	
	public List<test1> findAll() {
		return jdbcTemplate.query("SELECT * FROM GALLOP_INPUT_INTERFACE ",
				new BeanPropertyRowMapper<test1>(test1.class));
	}

	
	public List<test1> findempid() {	
		return jdbcTemplate.query("SELECT  SFE_INCENTIVE_CROSS_SELL_MIREN from GALLOP_INPUT_INTERFACE", 
				new BeanPropertyRowMapper<test1>(test1.class));
	}

	
	public List<test2> t2findAll() {
		return jdbcTemplate.query("SELECT * FROM test1",
				new BeanPropertyRowMapper<test2>(test2.class));
	}

	
	public List<test2> t2findempid() {
		return jdbcTemplate.query("SELECT EMPID FROM test1",
				new BeanPropertyRowMapper<test2>(test2.class));
	}

	
	}

	


	

	

	
	
        


	

