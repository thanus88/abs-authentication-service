package com.abs.corp.services.rest.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {
	
	@NotNull
    private BigDecimal lat;
	
	@NotNull
	private BigDecimal lng;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}
	
	

}
