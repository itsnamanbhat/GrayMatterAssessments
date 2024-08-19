package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.graymatter.entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{
	
	@Query(value="select * from application a where a.job_id=?",nativeQuery=true)
	public List<Application> findBySpecificJob(int id);
	
	
}
