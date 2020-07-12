package com.thengara.learning.publisher.service;

import java.util.List;

import com.thengara.learning.publisher.model.DataToPublish;

public interface TargetService {
	
	public void strat();
	
	public void publish(List<DataToPublish> batchToPublish);
	
	public void end();


}
