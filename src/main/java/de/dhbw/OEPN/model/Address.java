package de.dhbw.OEPN.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

	@SerializedName("street")
	@Expose
	private String street;
	@SerializedName("zip")
	@Expose
	private Integer zip;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("district")
	@Expose
	private String district;
	@SerializedName("number")
	@Expose
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
