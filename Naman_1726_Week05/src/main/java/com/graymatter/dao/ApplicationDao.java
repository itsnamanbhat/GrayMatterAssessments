package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Application;
import com.graymatter.exceptions.ResourceNotFoundException;
import com.graymatter.repositories.ApplicationRepository;

@Repository
public class ApplicationDao {
	
	@Autowired
	public ApplicationRepository repo;
	
	public List<Application> getAllApplictions(){
		return repo.findAll();
	}
	
	public Application addApplication(Application application){
		// TODO Auto-generated method stub
		return repo.save(application);
	}

	public Application getApplication(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
	public Application updateApplication(Application application) {
		return repo.save(application);
	}
	public void deleteApplication(int id) {
		 repo.deleteById(id);
	}
}
