package com.thengara.learning.publisher;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thengara.learning.publisher.model.Job;
import com.thengara.learning.publisher.service.PublisherService;

@SpringBootApplication
public class PublisherApplication {
	
	
    Logger logger = LoggerFactory.getLogger(PublisherApplication.class);

	
	@Autowired
	private final PublisherService publisherService;
	
	public PublisherApplication(PublisherService publisherService) {
		this.publisherService = publisherService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}

//	@PostConstruct
//	public void run() {
//		Job job = publisherService.publish();
//		logger.info( "Job submitted "+ job );
//	}

}
