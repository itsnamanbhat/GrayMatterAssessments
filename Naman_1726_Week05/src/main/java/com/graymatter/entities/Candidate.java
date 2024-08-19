package com.graymatter.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="candidate")
public class Candidate {

private String cName;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cId;

@Column(name="skillList")
private List<String> cSkills;

@Pattern(regexp = "[6789][0-9]{9}",message="mobile num must be 10 length starting with either 6,7,8,9")
private String cMobile;

private String cEmail;

private java.sql.Date cDob;

private String cPwd;

@OneToMany(mappedBy = "candidate")
@JsonIgnore
private List<Application> applications;

}
