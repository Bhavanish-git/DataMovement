package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.POJO.OrigTable;

@Repository
public class DataJDBCTemplate {

	@Autowired
	 JdbcTemplate dataTemplate;
	
	public List<OrigTable> gallopData() {
		return dataTemplate.query("SELECT * FROM GALLOP_INPUT_INTERFACE ",
				new BeanPropertyRowMapper<OrigTable>(OrigTable.class)); 
	}
	
	public List<OrigTable> payoutData() {
		return dataTemplate.query("SELECT * FROM PAYOUT_CBSL_PERCASE",
				new BeanPropertyRowMapper<OrigTable>(OrigTable.class));
	}
	
}
