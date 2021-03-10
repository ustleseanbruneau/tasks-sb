package com.leseanbruneau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leseanbruneau.domain.Task;
import com.leseanbruneau.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping( value = {"","/"})
	public Iterable<Task> list() {
		return this.taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}

}
