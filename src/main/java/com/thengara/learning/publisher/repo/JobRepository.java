package com.thengara.learning.publisher.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thengara.learning.publisher.model.Job;
import com.thengara.learning.publisher.model.JobStatus;

public interface JobRepository extends CrudRepository<Job, Long> {

	  List<Job> findByStatus(JobStatus status);

}