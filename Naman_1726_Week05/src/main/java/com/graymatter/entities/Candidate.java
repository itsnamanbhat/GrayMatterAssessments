package com.graymatter.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
private int cId;
@Column(name="skillList")

private List<String> cSkills;

private String cMobile;

private String cEmail;

private java.sql.Date cDob;

private String cPwd;

@OneToMany(mappedBy = "candidate")
private List<Application> applications;

}
