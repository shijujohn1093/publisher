package com.thengara.learning.publisher.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thengara.learning.publisher.repo.SourceRepository;

@Service
public class SourceServiceImpl implements SourceService {

	private final SourceRepository sourceRepository;
	
	
	@Autowired
	public SourceServiceImpl( SourceRepository sourceRepository) {
		this.sourceRepository = sourceRepository;
	}

	@Override
	public Date getBusienssDateToProcess() {
		return sourceRepository.getBusienssDateToProcess();
	}

}
