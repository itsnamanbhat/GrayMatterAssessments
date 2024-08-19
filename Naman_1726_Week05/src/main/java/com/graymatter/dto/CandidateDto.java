package com.graymatter.dto;

import java.util.List;

import com.graymatter.entities.Application;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
@Pattern(regexp = "[6789][0-9]{9}",message="mobile num must be 10 length starting with either 6,7,8,9")
private String cMobile;

@Email(message = "Email should be valid")
@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", message = "Email must be a valid Gmail address with at least one dot in the local part")
@NotBlank(message = "Email cannot be blank")
private String cEmail;

@NotNull(message = "Date of Birth cannot be null")
private java.sql.Date cDob;

@NotNull(message = "password cannot be null")
@Size(min = 8, max = 100, message = "Password should be between 8 and 100 characters")
@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])[A-Za-z\\d@#$%^&+=!]{8,}$", message = "Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character")
private String cPwd;

private List<Application> applications;

}
