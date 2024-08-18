package com.graymatter.dto;

import java.util.List;

import com.graymatter.entities.Application;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CandidateDto {
	
@NotBlank(message = "Name cannot be blank")
private String cName;

private int cId;

@Column(name="skillList")
@NotNull(message = "skills candidate can have a maximum of 10 skills")
private List<String> cSkills;

@NotBlank(message = "Mobile number cannot be blank")
@Size(min = 10, max = 15, message = "Mobile number should be between 10 and 15 characters")
private String cMobile;

@Email(message = "Email should be valid")
@NotBlank(message = "Email cannot be blank")
private String cEmail;

@NotNull(message = "Date of Birth cannot be null")
private java.sql.Date cDob;

@NotNull(message = "password cannot be null")
@Size(min = 8, max = 100, message = "Password should be between 8 and 100 characters")
private String cPwd;

private List<Application> applications;

}
