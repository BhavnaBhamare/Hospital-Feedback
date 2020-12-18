package com.pojo;

// Generated Jan 11, 2020 1:58:34 PM by Hibernate Tools 3.4.0.CR1

/**
 * Patient generated by hbm2java
 */
public class Patient implements java.io.Serializable {

	private String pid;
	private String pname;
	private String ptype;
	private String bedno;
	private String doctor;
	private String email;
	private String mobileno;
	private String address;

	public Patient() {
	}

	public Patient(String pid) {
		this.pid = pid;
	}

	public Patient(String pid, String pname, String ptype, String bedno, String doctor, String email, String mobileno,
			String address) {
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.bedno = bedno;
		this.doctor = doctor;
		this.email = email;
		this.mobileno = mobileno;
		this.address = address;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getBedno() {
		return this.bedno;
	}

	public void setBedno(String bedno) {
		this.bedno = bedno;
	}

	public String getDoctor() {
		return this.doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return this.mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
