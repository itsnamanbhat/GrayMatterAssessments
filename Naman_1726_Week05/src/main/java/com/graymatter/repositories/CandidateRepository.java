
package com.graymatter.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.graymatter.entities.Candidate;




public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

@Query(value= "SELECT * FROM candidate c WHERE c.c_email = ?1 AND c.c_pwd = ?2", nativeQuery=true)
public Candidate findCandidateByEmail(String email,String pwd)	;

}
