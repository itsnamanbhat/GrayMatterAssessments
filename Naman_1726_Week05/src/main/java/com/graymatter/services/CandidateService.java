package com.graymatter.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.CandidateDao;
import com.graymatter.dto.CandidateDto;
import com.graymatter.dto.CandidateMapper;

import com.graymatter.entities.Candidate;
import com.graymatter.exceptions.ResourceNotFoundException;

@Service
public class CandidateService implements CandidateServiceInterface {

	@Autowired
	CandidateDao dao;
	
	@Autowired
	CandidateMapper mapper;
	
	@Override
	public List<CandidateDto> getAllCandidates() {
		List<Candidate> iList=dao.getAllCandidates(); 
		return iList.stream().map((item)->mapper.mapToCandidateDto(item)).collect(Collectors.toList());
	}

	@Override
	public CandidateDto addCandidate(CandidateDto c) {
		return mapper.mapToCandidateDto(dao.addCandidate(mapper.mapToCandidate(c)));

	}

	@Override
	public CandidateDto getCandidateById(int id) {
		return mapper.mapToCandidateDto(dao.getCandidateById(id));
	}

	@Override
	public CandidateDto updateCandidate(CandidateDto c) {
		// TODO Auto-generated method stub
		return mapper.mapToCandidateDto(dao.updateCandidate(mapper.mapToCandidate(c)));
	}

	@Override
	public void deleteCandidate(int id) {
		dao.deleteCandidate(id);
		
	}

	@Override
	public boolean isSignedIn(String email, String pwd) throws ResourceNotFoundException {
	return dao.isSignedUp(email, pwd)!=null;
	}

	

}
