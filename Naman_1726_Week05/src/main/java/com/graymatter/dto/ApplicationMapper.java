package com.graymatter.dto;

import org.springframework.stereotype.Component;

import com.graymatter.entities.Application;

@Component
public class ApplicationMapper {
	public Application mapToApplication(ApplicationDto applicationDto) {
		return new Application(applicationDto.getAppId(),applicationDto.getAppDate(),applicationDto.getCandidate(),applicationDto.getJob());
	}
	
	public ApplicationDto mapToApplicationDto(Application application) {
		return new ApplicationDto(application.getAppId(),application.getAppDate(),application.getCandidate(),application.getJob());
	}
}
