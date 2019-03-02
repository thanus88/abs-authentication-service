package com.abs.corp.services.rest.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	
	private String addressNo;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}

}
