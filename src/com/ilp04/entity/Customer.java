package com.ilp04.entity;

public class Customer {
	private int customerCode;
	private String customerFirstName;
	private String customerLastName;
	private String address;
	private long phNumber;
	private long aadharNo;
	
	public Customer(int customerCode, String customerFirstName, String customerLastName, String address, long phNumber,
			long aadharNo) {
	
		this.customerCode = customerCode;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.address = address;
		this.phNumber = phNumber;
		this.aadharNo = aadharNo;
	}
	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

}
