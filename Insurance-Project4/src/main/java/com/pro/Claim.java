package com.pro;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Claim {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claim_Number;
	private String description;
	private Date claim_date;
	private String claim_status;	
	@OneToOne(cascade = jakarta.persistence.CascadeType.ALL)
	private Insurance_policy insurance_policy;
	public int getClaim_Number() {
		return claim_Number;
	}
	public void setClaim_Number(int claim_Number) {
		this.claim_Number = claim_Number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getClaim_date() {
		return claim_date;
	}
	public void setClaim_date(Date claim_date) {
		this.claim_date = claim_date;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public Insurance_policy getInsurance_policy() {
		return insurance_policy;
	}
	public void setInsurance_policy(Insurance_policy insurance_policy) {
		this.insurance_policy = insurance_policy;
	}
	@Override
	public String toString() {
		return "Claim [claim_Number=" + claim_Number + ", description=" + description + ", claim_date=" + claim_date
				+ ", claim_status=" + claim_status + ", insurance_policy=" + insurance_policy + "]";
	}
	public Claim(int claim_Number, String description, Date claim_date, String claim_status,
			Insurance_policy insurance_policy) {
		super();
		this.claim_Number = claim_Number;
		this.description = description;
		this.claim_date = claim_date;
		this.claim_status = claim_status;
		this.insurance_policy = insurance_policy;
	}
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
		
	
	
}
