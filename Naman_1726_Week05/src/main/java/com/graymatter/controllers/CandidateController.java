package com.graymatter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.dto.CandidateDto;
import com.graymatter.exceptions.ResourceNotFoundException;
import com.graymatter.services.CandidateService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v1")
public class CandidateController {
	
	@Autowired
	CandidateService service;
	
	@GetMapping("/candidate")
	public List<CandidateDto> getAllCandidates() {
		return service.getAllCandidates();
	}
	@PostMapping("/candidate")
	public CandidateDto addCandidate(@RequestBody CandidateDto c) {
		return service.addCandidate(c);
	}
	
	@GetMapping("/candidate/{id}")
	public CandidateDto getCandidateById(@PathVariable("id" )int id) throws ResourceNotFoundException{
		return service.getCandidateById(id);
	}
	
	@DeleteMapping("/candidate/{id}")
	public void deleteCandidate(@PathVariable("id") int id) throws ResourceNotFoundException{
		 service.deleteCandidate(id);
	}
	
	@PutMapping("/candidate")
	public CandidateDto updateCandidate(@RequestBody CandidateDto c) {
		return service.updateCandidate(c);
	}
	 @PostMapping("/candidate/login")
	    public String candidateLogin(@PathVariable String email, @PathVariable String password) throws ResourceNotFoundException {
		 if (service.isSignedIn(email, password)) {
	            return "Login successful";
	        } else {
	            return "Invalid credentials";
	        }
	 }
	}

