package com.cg.onetoone.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="address")
public class Address implements Serializable {

	@Id @Column(name="address_id")
	private Integer addressId;
	
	@Column(name="address_street")
	private String street;
	
	@Column(name="address_city")
    private String city;
	
	@Column(name="address_state")
	private String state;
	
	@Column(name="address_zipcode")
	private String zipcode;
	
	

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
