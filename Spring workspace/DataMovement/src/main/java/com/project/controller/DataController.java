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
import com.project.spare.DataJDBCTemplate;


@RestController
public class DataController {
	
	@Autowired
	DataJDBCTemplate temp;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
				
	@GetMapping("/gallop")
	public List<OrigTable> gallop() {
		return temp.gallopData();		
	}
	
	@GetMapping("/payout")
	public List<OrigTable> payout() {
		return temp.payoutData() ;
	}
	
	@RequestMapping(path="/payout/{AGREEMENT_NO}")
    public List<OrigTable> displaydate(@PathVariable("AGREEMENT_NO") String AGREEMENT_NO ) 
             {
		
		return jdbcTemplate.query("SELECT * FROM GALLOP_INPUT_INTERFACE ",
				new BeanPropertyRowMapper<OrigTable>(OrigTable.class)); 
    }
	
	
}
