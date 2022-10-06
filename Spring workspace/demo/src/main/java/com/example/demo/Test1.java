package com.example.demo;

import java.sql.Date;

public class Test1 {
	
	private String EMPID;
    private Date JOINING_DATE;
    private String STATUS;
    
    public Test1(){
    	
    }
    
    public Test1(String EMPID , Date JOINING_DATE ,String STATUS ) {
    	
    	this.EMPID = EMPID;
    	this.JOINING_DATE = JOINING_DATE;
    	this.STATUS = STATUS;
    }
    
	public String getEMPID() {
		return EMPID;
	}
	public void setEMPID(String eMPID) {
		EMPID = eMPID;
	}
	public Date getJOINING_DATE() {
		return JOINING_DATE;
	}
	public void setJOINING_DATE(Date jOINING_DATE) {
		JOINING_DATE = jOINING_DATE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
    

}
