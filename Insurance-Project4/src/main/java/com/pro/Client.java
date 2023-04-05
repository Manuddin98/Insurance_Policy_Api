package com.pro;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Client {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private Date dob;
	private String Address;
	private String Contact_Information;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact_Information() {
		return Contact_Information;
	}
	public void setContact_Information(String contact_Information) {
		Contact_Information = contact_Information;
	}
	@Override
	public String toString() {
		return "Client [Id=" + Id + ", Name=" + Name + ", dob=" + dob + ", Address=" + Address
				+ ", Contact_Information=" + Contact_Information + "]";
	}
	public Client(int id, String name, Date dob, String address, String contact_Information) {
		super();
		Id = id;
		Name = name;
		this.dob = dob;
		Address = address;
		Contact_Information = contact_Information;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
