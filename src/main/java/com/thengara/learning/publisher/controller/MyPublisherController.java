package com.thengara.learning.publisher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.thengara.learning.publisher.model.Job;
import com.thengara.learning.publisher.service.JobService;
import com.thengara.learning.publisher.service.PublisherService;

@RestController
public class MyPublisherController {

	private final JobService jobService;
	private final PublisherService publisherService;

	public MyPublisherController(JobService jobService,PublisherService publisherService){
		this.jobService = jobService;
		this.publisherService = publisherService;
	}
	
	@GetMapping("/job/{jobId}")
    public Job getJobById(@PathVariable Long jobId) {
        return jobService.findById(jobId);
    }
	
	@GetMapping("/publish")
    public Job getCustomerById() {
        return publisherService.publish();
    }
}
