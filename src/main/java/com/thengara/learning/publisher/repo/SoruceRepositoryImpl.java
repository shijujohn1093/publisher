package com.thengara.learning.publisher.repo;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository
public class SoruceRepositoryImpl implements SourceRepository {
	@Override
	public Date getBusienssDateToProcess() {
		return new Date(System.currentTimeMillis());
	}
}
