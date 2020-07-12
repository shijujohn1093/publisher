package com.thengara.learning.publisher.service;

import java.sql.Date;
import java.util.List;

import com.thengara.learning.publisher.model.Job;

public interface JobService {
	
	public List<Job> getPendingJobs() ;
	
	public Job createJob(Date businessDate);
	
	public Job save(Job job);

	Job findById(Long id);

}
