package com.ihub.www;

import java.util.Date;

public class RegisterBean 
{
	private String email;
	private long phone;
	private String name;
	private String address;
	private Date date;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "RegisterBean [email=" + email + ", phone=" + phone + ", name="
				+ name + ", address=" + address + ", date=" + date + "]";
	}
}
