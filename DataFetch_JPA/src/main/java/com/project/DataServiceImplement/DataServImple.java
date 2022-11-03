package com.project.DataServiceImplement;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.DataServiceInterface.DataService;
import com.project.POJO.OrigTable;
import com.project.RepoInterface.RepoInterface;


@Transactional
@Service("dataServImple")

public class DataServImple implements DataService {
	
	@Autowired(required = false)
	RepoInterface repoInterface;

	@Override
	public List<OrigTable> findAll() {
		return (List<OrigTable>) repoInterface.findAll();
	}

	@Override
	public List<OrigTable> findByAGREEMENT_NO(String aggNo) { 
		return (List<OrigTable>) repoInterface.findByAGREEMENTNO(aggNo);
	}

	@Override
	public List<OrigTable> findByLMS_DATELike(String date) throws ParseException {
		return (List<OrigTable>) repoInterface.findByLMSDATELike( dateConvert(date));
	}
	
	@Override
	public List<OrigTable> findByLMS_DATEBetween(String sDate,String eDate) throws ParseException {
		  return (List<OrigTable>) repoInterface.findByLMSDATEBetween( dateConvert(sDate),dateConvert(eDate));
	}
	
	
	//String to SQL date conversion 
	private Date dateConvert(String startDate) throws ParseException {

		  SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yy");          // New Pattern
	      java.util.Date date = sdf1.parse(startDate);                      // Returns a Date format object with the pattern
	      java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
	      return sqlStartDate;
	}

	/*private Date dateConvert(String startDate) throws ParseException {
	      SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yy") ;
	      java.util.Date date = sdf1.parse(startDate) ;
	      java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()) ;
	      return sqlStartDate ;	      */
	}
	

