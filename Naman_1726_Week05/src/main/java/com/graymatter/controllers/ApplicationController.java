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

import com.graymatter.dto.ApplicationDto;
import com.graymatter.exceptions.ResourceNotFoundException;
import com.graymatter.services.ApplicationService;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {
	
	@Autowired
	ApplicationService service;
	
	@GetMapping("/application")
	public List<ApplicationDto> getAllApplications(){
		return service.getAllAplications();
		
	}
	
	@PostMapping("/application")
	public ApplicationDto addItem(@RequestBody ApplicationDto a) {
		return service.addApplication(a);
	}
	
	@GetMapping("/application/{id}")
	public ApplicationDto getApplication(@PathVariable("id") int id) throws ResourceNotFoundException
	{
		return service.getApplicationById(id);
	}
	
	@DeleteMapping("/application/{id}")
	public void delteApplication(@PathVariable("id") int id) throws ResourceNotFoundException
	{
		 service.deleteApplication(id);
	}
	
	@PutMapping("/application")
	public ApplicationDto updateApplication(ApplicationDto a) {
		return service.updateApplication(a);
	}
}
