package com.orm;
//plain old java object(POJO)

import javax.persistence.Column;
import javax.persistence.Id;

@javax.persistence.Entity
public class Emp1 {

	@Id
	private int empid;
	@Column
	private String empname;
	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Emp1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	

}
