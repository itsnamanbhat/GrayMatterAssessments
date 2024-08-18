package com.graymatter.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="application")
public class Application {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int appId;

private Date appDate;


@ManyToOne
@JoinColumn(name = "candidateId")
private Candidate candidate;

@ManyToOne
@JoinColumn(name = "jobId")
private Job job;
}
