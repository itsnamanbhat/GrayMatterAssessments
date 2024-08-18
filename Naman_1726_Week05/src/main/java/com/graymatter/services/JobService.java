package com.graymatter.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.JobsDao;
import com.graymatter.dto.JobDto;
import com.graymatter.dto.JobMapper;
import com.graymatter.entities.Job;
import com.graymatter.exceptions.ResourceNotFoundException;

@Service
public class JobService implements JobServiceInterface {
	@Autowired
	JobsDao dao;
	
	@Autowired
	JobMapper mapper;

	@Override
	public List<JobDto> getAllJobs() {
		List<Job> iList=dao.getAllJobs(); 
		return iList.stream().map((item)->mapper.mapToJobDto(item)).collect(Collectors.toList());
	}

	@Override
	public JobDto addJob(JobDto j) {
		return mapper.mapToJobDto(dao.addJob(mapper.mapToJob(j)));
	}

	@Override
	public JobDto getJobById(int id) throws ResourceNotFoundException {
		return mapper.mapToJobDto(dao.getJobById(id));
	}

	@Override
	public JobDto updateJob(JobDto j) {
		return mapper.mapToJobDto(dao.addJob(mapper.mapToJob(j)));
	}

	@Override
	public void deleteJob(int id) {
		dao.deleteJob(id);
		
	}

	@Override
	public List<JobDto> findAllJobsByCandidateId(int id) {
		  List<Job> jobs = dao.findAllJobsByCandidateId(id);
		  return jobs.stream().map((item)->mapper.mapToJobDto(item)).collect(Collectors.toList());
	}

	@Override
	public List<JobDto> findJobByTitle(String title) {
		List<Job> jobs = dao.getByJobTitle(title);
		return jobs.stream().map((item)->mapper.mapToJobDto(item)).collect(Collectors.toList());
	}

	@Override
	public List<JobDto> findByLocation(String loaction) {
		List<Job> jobs = dao.getByJobLocation(loaction);
		return jobs.stream().map((item)->mapper.mapToJobDto(item)).collect(Collectors.toList());
	}

	@Override
	public List<JobDto> findByRequiredSkills(List<String> skills) {
		List<Job> jobs = dao.getByRequiredSkills(skills);
		return jobs.stream().map((item)->mapper.mapToJobDto(item)).collect(Collectors.toList());
	}

	

}
