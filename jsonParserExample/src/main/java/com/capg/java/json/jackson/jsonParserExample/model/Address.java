package com.capg.java.json.jackson.jsonParserExample.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data

public class Address {

	private String street;
	private String zipcode;
	private String city;
	/*
	 * public String getStreet() { return street; } public void setStreet(String
	 * street) { this.street = street; } public String getZipcode() { return
	 * zipcode; } public void setZipcode(String zipcode) { this.zipcode = zipcode; }
	 * public String getCity() { return city; } public void setCity(String city) {
	 * this.city = city; }
	 * 
	 * @Override public String toString() { return "Address [street=" + street +
	 * ", zipcode=" + zipcode + ", city=" + city + "]"; }
	 */
	

}
