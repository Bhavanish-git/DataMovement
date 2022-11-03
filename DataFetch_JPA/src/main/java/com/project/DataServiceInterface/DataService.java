package com.project.DataServiceInterface;


import java.text.ParseException;
import java.util.List;

import com.project.POJO.OrigTable;

public interface DataService {
	
	public List<OrigTable> findAll();
	
	public List<OrigTable> findByLMS_DATELike(String date) throws ParseException;
	 
	public List<OrigTable> findByAGREEMENT_NO(String aggNo);
	
	public List<OrigTable> findByLMS_DATEBetween(String sDate , String eDate) throws ParseException;
	
	

}
