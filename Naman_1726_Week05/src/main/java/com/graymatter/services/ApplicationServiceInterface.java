package com.graymatter.services;

import java.util.List;

import com.graymatter.dto.ApplicationDto;
import com.graymatter.exceptions.ResourceNotFoundException;

public interface ApplicationServiceInterface {
	public List<ApplicationDto> getAllAplications();
	public ApplicationDto addApplication(ApplicationDto a);
	public ApplicationDto getApplicationById(int id) throws ResourceNotFoundException;
	public ApplicationDto updateApplication(ApplicationDto a);
	public void deleteApplication(int id);
}
