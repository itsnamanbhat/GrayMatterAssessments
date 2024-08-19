package com.graymatter.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jobs")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	private String jobTitle;
	private String jobLocation;
	private List<String> requiredSkills;
	private double jobSalary;
	@OneToMany(mappedBy = "job")
	@JsonIgnore
	private List<Application> applications;
	
}
