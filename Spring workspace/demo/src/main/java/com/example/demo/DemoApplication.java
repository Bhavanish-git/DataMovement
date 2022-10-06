package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication

public class DemoApplication implements CommandLineRunner{
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Autowired
	 JdbcTemplate jdbctemp;
	@Override
	 public void run(String... args) throws Exception {
	        String sql = "SELECT * FROM test1";
	         
	        List<Test1> xtable = jdbctemp.query(sql,
	                BeanPropertyRowMapper.newInstance(Test1.class));
	         
	        xtable.forEach(System.out :: println);
	    }

	
	
}
