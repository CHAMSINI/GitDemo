package com.basic;

public class Address {
	String drno;
	String street;
	String city;
	int pincode;
	public Address(String drno,String street,String city,int pincode) {
		this.drno=drno;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}
	public String getdrno() {
		return drno;
	}
	public void setdrno(String drno) {
		this.drno=drno;
	}
	public String getstreet() {
		return street;
	}
	public void setstreet(String street) {
		this.street=street;
	}
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public int getpincode() {
		return pincode;
	}
	public void setpincode(int pincode) {
		this.pincode=pincode;
	}

}
