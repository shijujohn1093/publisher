package com.thengara.learning.publisher.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thengara.learning.publisher.config.Appconfig;
import com.thengara.learning.publisher.model.Job;
import com.thengara.learning.publisher.model.JobStatus;
import com.thengara.learning.publisher.repo.JobRepository;

@Service
public class JobServiceImpl implements JobService {

	private final JobRepository jobRepository;

	@Autowired
	public JobServiceImpl(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}

	public List<Job> getPendingJobs() {
		return jobRepository.findByStatus(JobStatus.PROCESSING);
	}

	public Job createJob(Date businessDate) {
		Job job = new Job();
		job.setModule(Appconfig.MODULE);
		job.setStatus(JobStatus.PROCESSING.name());
		job.setBusinessDate(businessDate);
		return save(job);		
	}

	@Override
	public Job save(Job job) {
		return jobRepository.save(job);		
	}
	
	@Override
	public Job findById(Long  id) {
		Optional<Job> opJob =  jobRepository.findById(id)	;
		return opJob.isEmpty() ? null : opJob.get();
	}


}
