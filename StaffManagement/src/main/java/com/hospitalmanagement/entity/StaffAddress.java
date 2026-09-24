package com.hospitalmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "staff_address")
public class StaffAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long staffAddressId;
	
	private String doorNumber;
	
	private String landmark;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pinCode;

	public StaffAddress(String doorNumber, String landmark, String city, String state, String country, String pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	
}
