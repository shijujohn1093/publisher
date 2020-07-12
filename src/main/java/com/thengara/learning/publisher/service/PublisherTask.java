package com.thengara.learning.publisher.service;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thengara.learning.publisher.model.Job;
import com.thengara.learning.publisher.model.JobStatus;

public class PublisherTask implements Runnable {
    Logger logger = LoggerFactory.getLogger(PublisherTask.class);

	private final Job job;
	private final JobService jobService;
	private final SourceService sourceService;
	private final TargetService targetService;	
	
	
	public PublisherTask(Job job, JobService jobService, SourceService sourceService, TargetService targetService) {
		super();
		this.job = job;
		this.jobService = jobService;
		this.sourceService = sourceService;
		this.targetService = targetService;
	}

	
	@Override
	public void run()  {
		logger.info("sleeping for 10 seconds");
		try {
			// This sleep is only for testing
			TimeUnit.SECONDS.sleep(20);
			logger.info("activated after 10 seconds");
			job.setStatus(JobStatus.COMPLETED.name());
			jobService.save(job);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		logger.info(">>>>>> job saved after 10 seconds");
		
	}

	
	
	

}
