package com.graymatter.dto;

import org.springframework.stereotype.Component;

import com.graymatter.entities.Candidate;

@Component
public class CandidateMapper {
	public Candidate mapToCandidate(CandidateDto candidateDto) {
		return new Candidate(candidateDto.getCName(),candidateDto.getCId(),candidateDto.getCSkills(),candidateDto.getCMobile(),candidateDto.getCEmail(),candidateDto.getCDob(),candidateDto.getCPwd(),candidateDto.getApplications());
	}
	
	public CandidateDto mapToCandidateDto(Candidate candidate) {
		return new CandidateDto(candidate.getCName(),candidate.getCId(),candidate.getCSkills(),candidate.getCMobile(),candidate.getCEmail(),candidate.getCDob(),candidate.getCPwd(),candidate.getApplications());
	}
}
