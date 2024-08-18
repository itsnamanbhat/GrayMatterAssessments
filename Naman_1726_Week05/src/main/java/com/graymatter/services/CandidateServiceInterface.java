package com.graymatter.services;

import java.util.List;

import com.graymatter.dto.CandidateDto;
import com.graymatter.exceptions.ResourceNotFoundException;

public interface CandidateServiceInterface {
	public List<CandidateDto> getAllCandidates();
	public CandidateDto addCandidate(CandidateDto c);
	public CandidateDto getCandidateById(int id);
	public CandidateDto updateCandidate(CandidateDto c);
	public void deleteCandidate(int id);
	public boolean isSignedIn(String email, String pwd) throws ResourceNotFoundException;
}
