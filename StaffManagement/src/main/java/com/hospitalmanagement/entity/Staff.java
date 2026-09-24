package com.hospitalmanagement.entity;

import java.time.LocalDate;

import com.hospitalmanagement.enums.Gender;
import com.hospitalmanagement.enums.Specialization;
import com.hospitalmanagement.enums.StaffType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long staffId;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	
	private String role;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private Specialization specialization;
	
	private LocalDate DOJ;
	
	private int experinceInYears;
	
	private boolean canLogin;
	
	private boolean isEmployeeActive;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_details_id")
	private StaffDetails staffDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_address_id")
	private StaffAddress staffAddress;
}
