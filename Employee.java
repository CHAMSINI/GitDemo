package com.basic;

public class Employee {
	private int empid;
	private String ename;
	private String job;
	private String dname;
	private Address address;
	public Employee(int empid,String ename,String job,String dname,Address address){
		this.empid=empid;
		this.ename=ename;
		this.job=job;
		this.dname=dname;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid=empid;
	}
	public String ename() {
		return ename;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public String getjob() {
		return job;
	}
	public void setjob(String job) {
		this.job=job;
	}
	public String dname() {
		return dname;
	}
	public void setdname(String dname) {
		this.dname=dname;
	}
}