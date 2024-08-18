
package com.graymatter.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.graymatter.entities.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{
	
	@Query("SELECT DISTINCT a.job FROM Application a WHERE a.candidate.cId = :candidateId")
    List<Job> findAllJobsByCandidateId(@Param("candidateId") int candidateId);

	public List<Job> findByJobTitle(String jobTitle);
	public List<Job> findByJobLocation(String jobLocation);
	public List<Job> findByRequiredSkills(List<String> requiredSkills);
	
	

}