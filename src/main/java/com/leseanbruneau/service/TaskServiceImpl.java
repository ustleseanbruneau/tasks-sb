package com.leseanbruneau.service;

import org.springframework.stereotype.Service;

import com.leseanbruneau.domain.Task;
import com.leseanbruneau.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	private TaskRepository taskRespository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRespository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		// TODO Auto-generated method stub
		return this.taskRespository.findAll();
	}

	@Override
	public Task save(Task task) {
		// TODO Auto-generated method stub
		return this.taskRespository.save(task);
	}

}
