package com.leseanbruneau.service;

import com.leseanbruneau.domain.Task;

public interface TaskService {
	
	Iterable<Task> list();
	
	Task save(Task task);

}
