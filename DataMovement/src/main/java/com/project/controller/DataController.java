package com.project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.POJO.OrigTable;
import com.project.Service.DataJDBCTemplate;

@RestController
public class DataController {
	
	
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	DataJDBCTemplate temp;
	
	//Displays all data from Gallop	
	
	@GetMapping("/gallop")
	public List<OrigTable> gallop() {
		return  temp.gallopData();		
	}
	
	//Displays all data from Pay out			

	@GetMapping("/payout")
	public List<OrigTable> payout() {
		return  temp.payoutData();
	}
	
	//Display the records between the given LMS_DATE
	
	@RequestMapping(path="/date/{S_DATE}/{E_DATE}")
    public List<OrigTable> displaydate(@PathVariable("S_DATE") String S_DATE,
    		                           @PathVariable("E_DATE") String E_DATE) {		
		
		return jdbc.query("SELECT * FROM GALLOP_INPUT_INTERFACE where LMS_DATE >= '"+S_DATE +"' and LMS_DATE <=  '"+E_DATE+"' " ,
			    new BeanPropertyRowMapper<OrigTable>(OrigTable.class));	
	}
	
	@RequestMapping(path="/date/{LMS_DATE}")
    public List<OrigTable> displaydate(@PathVariable("LMS_DATE") String LMS_DATE)   {		
		return jdbc.query("SELECT * FROM GALLOP_INPUT_INTERFACE where LMS_DATE = '"+LMS_DATE +"' ",
			    new BeanPropertyRowMapper<OrigTable>(OrigTable.class));	
	}
	
	@RequestMapping("/hi")
	public String hey() {
		return  temp.hi();
	}
}
