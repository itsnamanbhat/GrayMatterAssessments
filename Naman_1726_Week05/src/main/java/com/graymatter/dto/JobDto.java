package com.graymatter.dto;

import java.util.List;

import com.graymatter.entities.Application;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobDto {
	private int jobId;
	
	@NotNull(message = "Job title cannot be null")
	private String jobTitle;
	
	@NotNull(message = "Job Location cannot be null")
	private String jobLocation;
	
	@NotNull
	private List<String> requiredSkills;
	
	@NotNull(message = "Salary cannot be null")
	private double jobSalary;
	
	@NotNull
	private List<Application> applications;
	
}
