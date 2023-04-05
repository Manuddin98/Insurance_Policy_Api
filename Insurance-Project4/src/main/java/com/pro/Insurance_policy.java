package com.pro;

import java.sql.Date;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurance_policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_Number;
	private String type;
	private float coverage_Amount;
	private int premium;
	private Date start_Date;
	private Date end_Date;
	@OneToOne(cascade = CascadeType.ALL)
	private Client client;
	public int getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(int policy_Number) {
		this.policy_Number = policy_Number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCoverage_Amount() {
		return coverage_Amount;
	}
	public void setCoverage_Amount(float coverage_Amount) {
		this.coverage_Amount = coverage_Amount;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public Date getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Insurance_policy [policy_Number=" + policy_Number + ", type=" + type + ", coverage_Amount="
				+ coverage_Amount + ", premium=" + premium + ", start_Date=" + start_Date + ", end_Date=" + end_Date
				+ ", client=" + client + "]";
	}
	public Insurance_policy(int policy_Number, String type, float coverage_Amount, int premium, Date start_Date,
			Date end_Date, Client client) {
		super();
		this.policy_Number = policy_Number;
		this.type = type;
		this.coverage_Amount = coverage_Amount;
		this.premium = premium;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
		this.client = client;
	}
	public Insurance_policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
