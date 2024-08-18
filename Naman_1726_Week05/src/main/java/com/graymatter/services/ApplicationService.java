package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

import com.graymatter.dao.ApplicationDao;
import com.graymatter.dto.ApplicationDto;
import com.graymatter.dto.ApplicationMapper;
import com.graymatter.entities.Application;
import com.graymatter.exceptions.ResourceNotFoundException;

@Service
public class ApplicationService implements ApplicationServiceInterface {

	@Autowired
	ApplicationDao dao;
	
	@Autowired
	ApplicationMapper mapper;

	@Override
	public List<ApplicationDto> getAllAplications() {
		List<Application> iList=dao.getAllApplictions(); 
		return iList.stream().map((item)->mapper.mapToApplicationDto(item)).collect(Collectors.toList());
	}

	@Override
	public ApplicationDto addApplication(ApplicationDto a) {
		return mapper.mapToApplicationDto(dao.addApplication(mapper.mapToApplication(a)));
	}

	@Override
	public ApplicationDto getApplicationById(int id) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		return mapper.mapToApplicationDto(dao.getApplication(id));
	}

	@Override
	public ApplicationDto updateApplication(ApplicationDto a) {
		
		return  mapper.mapToApplicationDto(dao.updateApplication(mapper.mapToApplication(a)));
	}

	@Override
	public void deleteApplication(int id) {
		dao.deleteApplication(id);
		
	}
}
