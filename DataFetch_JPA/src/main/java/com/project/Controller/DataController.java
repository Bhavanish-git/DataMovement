package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.DataServiceImplement.DataServImple;
import com.project.POJO.OrigTable;

@RestController

public class DataController {

	@Autowired
	DataServImple dataserv;
	
    @GetMapping("/gallop")
    public List<OrigTable> payout() {
    
    	//List l=dataserv.findAll();
    	
	   return  dataserv.findAll();
    	
    	//return l.size();
    }
    
    
	
	 @GetMapping("/testing")
	    public String testing() {
		return  "working fine";
}

}
