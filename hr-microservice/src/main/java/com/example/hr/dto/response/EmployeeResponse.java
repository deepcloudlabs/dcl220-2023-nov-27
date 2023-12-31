package com.example.hr.dto.response;

import java.util.List;

import com.example.hr.domain.Department;
import com.example.hr.domain.FiatCurrency;
import com.example.hr.domain.JobStyle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeResponse {
	private String identityNo;
	private String firstName;
	private String lastName;
	private String iban;
	private double salary;
	private FiatCurrency currency;
	private int birthYear;
	private String photo;
	private List<Department> departments;
	private JobStyle jobStyle;
	
}
