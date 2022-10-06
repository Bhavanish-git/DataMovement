package com.sample.DBcon;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class test2 {
	
	private int EMPID;
	private Date JOINING_DATE;
	private String STATUS;
	public int getEMPID() {
		return EMPID;
	}
	
	public test2() {
		
	}
	
	public test2( int EMPID,Date JOINING_DATE,String STATUS) {
		this.EMPID = EMPID;
		this.JOINING_DATE= JOINING_DATE;
		this.STATUS = STATUS;
		
	}
	public void setEMPID(int eMPID) {
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
