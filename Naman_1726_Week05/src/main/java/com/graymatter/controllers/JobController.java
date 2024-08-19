package com.graymatter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.dto.JobDto;
import com.graymatter.exceptions.ResourceNotFoundException;
import com.graymatter.services.JobService;

@RestController
@RequestMapping("/api/v1/")
public class JobController {

	@Autowired
	JobService service;
	
	@GetMapping("/job")
	public List<JobDto> getAllJobs() {
		return service.getAllJobs();
	}
	@PostMapping("/job")
	public JobDto addJob(@RequestBody JobDto c) {
		return service.addJob(c);
	}
	
	@GetMapping("/getJob/{id}")
	public JobDto getJobById(@PathVariable("id" )int id) throws ResourceNotFoundException{
		return service.getJobById(id);
	}
	
	@DeleteMapping("/job/{id}")
	public void deleteJob(@PathVariable("id") int id) throws ResourceNotFoundException{
		 service.deleteJob(id);
	}
	
	@PutMapping("/job")
	public JobDto updateCandidate(@RequestBody JobDto c) {
		return service.updateJob(c);
	}
	
	 @GetMapping("/jobCandidate/{candidateId}")
	    public List<JobDto> getJobsAppliedByCandidate(@PathVariable("candidateId") int candidateId) {
	        return service.findAllJobsByCandidateId(candidateId);
	    }
	 
	 @GetMapping("/jobTitle/{title}")
	 public List<JobDto> getJobByTitle(@PathVariable String title) {
		 return service.findJobByTitle(title);
	 }
	 
	 @GetMapping("/jobLocation/{location}")
	 public List<JobDto> getJobByLocation(@PathVariable String location) {
		 return service.findByLocation(location);
	 }
	 @GetMapping("/jobSkill/{skills}")
	 public List<JobDto> getJobBySkills(@PathVariable List<String> skills) {
		 return service.findByRequiredSkills(skills);
	 }
}
