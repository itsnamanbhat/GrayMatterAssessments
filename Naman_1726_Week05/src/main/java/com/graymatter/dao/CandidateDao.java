package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Candidate;
import com.graymatter.repositories.CandidateRepository;

@Repository
public class CandidateDao {
	@Autowired
	public CandidateRepository repo;
	
	public List<Candidate> getAllCandidates() {
		return repo.findAll();
		}
	public Candidate getCandidateById(int id) {
		return repo.findById(id).get();
	}
	public Candidate addCandidate(Candidate candidate){
		// TODO Auto-generated method stub
		return repo.save(candidate);
	}
	public Candidate updateCandidate(Candidate c) {
		return repo.save(c);
	}
	
	public void deleteCandidate(int id) {
		repo.deleteById(id);
	}
	public Candidate isSignedUp(String email, String password) {
		return repo.findCandidateByEmail(email, password);
	}

}
