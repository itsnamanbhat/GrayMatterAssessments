package com.graymatter.services;

import java.util.List;

import com.graymatter.dto.JobDto;
import com.graymatter.exceptions.ResourceNotFoundException;

public interface JobServiceInterface {
	public List<JobDto> getAllJobs();
	public JobDto addJob(JobDto j);
	public JobDto getJobById(int id) throws ResourceNotFoundException;
	public JobDto updateJob(JobDto j);
	public void deleteJob(int id);
	public List<JobDto> findAllJobsByCandidateId(int id);
	public List<JobDto> findJobByTitle(String title);
	public List<JobDto> findByLocation(String loaction);
	public List<JobDto> findByRequiredSkills(List<String> skills);
}
