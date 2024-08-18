
package com.graymatter.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.graymatter.entities.Candidate;




public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

@Query(value= "SELECT * FROM candidate c WHERE c.cEmail LIKE ?1 AND c.cPwd LIKE ?2", nativeQuery=true)
public Candidate findCandidateByEmail(String email,String pwd)	;

}
