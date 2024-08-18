package com.graymatter.dto;

import java.sql.Date;

import com.graymatter.entities.Candidate;
import com.graymatter.entities.Job;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDto {
	private int appId;
	
	@NotNull(message = "Application date cannot be null")
	private Date appDate;

	@NotNull(message = "Candidate cannot be null")
	private Candidate candidate;

	@NotNull(message = "Jobs date cannot be null")
	private Job job;
}
