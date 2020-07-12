package com.thengara.learning.publisher.service;

import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thengara.learning.publisher.model.Job;

@Service
public class PublisherServiceImpl implements PublisherService {
	
	private final SourceService sourceService;
	private final JobService jobService;
	private final TargetService targetService;
	
	
	@Autowired
	PublisherServiceImpl(SourceService sourceService, TargetService targetService, JobService jobService){
		this.sourceService = sourceService;
		this.targetService= targetService;
		this.jobService = jobService;
		
	}

	@Override
	public Job publish() {		
		Date businessDate = sourceService.getBusienssDateToProcess();
		Job job = jobService.createJob(businessDate);
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    executor.execute(new PublisherTask(job, jobService, sourceService, targetService));
	    executor.shutdown();
		return job;
	}

}
