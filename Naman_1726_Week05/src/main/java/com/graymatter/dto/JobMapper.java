package com.graymatter.dto;

import org.springframework.stereotype.Component;

import com.graymatter.entities.Job;

@Component
public class JobMapper {
	public Job mapToJob(JobDto jobDto) {
		return new Job(jobDto.getJobId() ,jobDto.getJobTitle(),jobDto.getJobLocation(),jobDto.getRequiredSkills(),jobDto.getJobSalary(),jobDto.getApplications());
	}
	
	public JobDto mapToJobDto(Job job) {
		return new JobDto(job.getJobId(),job.getJobTitle(),job.getJobLocation(),job.getRequiredSkills(),job.getJobSalary(),job.getApplications());
	}
}
