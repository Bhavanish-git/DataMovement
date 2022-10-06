package com.sample.DBcon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	@Autowired 
	public EmployeeDAO empdata;
	
	 @GetMapping("/alldata")
	 public List<test1> getAllData(){
	        return empdata.findAll();
	 }
	    
	@GetMapping("/t1data")
	public List<test1> findAll() {
		return empdata.findAll();
	}
	
	@GetMapping("/t1empid")
	public List<test1> findempid(){
		return empdata.findempid();
	}
	
    @GetMapping("/t2data")
	public List<test2> t2findAll() {
		return empdata.t2findAll();
	}
	
	@GetMapping("/t2empid")
	public List<test2> t2findempid(){
		return empdata.t2findempid();
	}
	
	
}
