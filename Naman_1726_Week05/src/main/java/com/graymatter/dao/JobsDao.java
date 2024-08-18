package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Job;
import com.graymatter.exceptions.ResourceNotFoundException;
import com.graymatter.repositories.JobRepository;

@Repository
public class JobsDao {

	@Autowired
	public JobRepository repo;
	
	public List<Job> getAllJobs(){
		return repo.findAll();
	}
	
	public Job addJob(Job job){
		// TODO Auto-generated method stub
		return repo.save(job);
	}

	public Job getJobById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	 public List<Job> findAllJobsByCandidateId(int candidateId) {
	        return repo.findAllJobsByCandidateId(candidateId);
	    }
	
	public Job updateJob(Job j) {
		return repo.save(j);
	}
	
	public void deleteJob(int id) {
		repo.deleteById(id);
	}


	public List<Job> getByJobTitle(String jobTitle){;
	return repo.findByJobTitle(jobTitle);
	}
	public List<Job> getByJobLocation(String jobLocation){
		return repo.findByJobLocation(jobLocation);
	};
	public List<Job> getByRequiredSkills(List<String> requiredSkills){
		return repo.findByRequiredSkills(requiredSkills);
	};
}
