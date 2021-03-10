package com.leseanbruneau;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.leseanbruneau.domain.Task;
import com.leseanbruneau.service.TaskService;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.save( new Task(1L, "Task 1", LocalDate.now(), true) );
			taskService.save( new Task(2L, "Task 2", LocalDate.now(), true) );
			taskService.save( new Task(3L, "Task 3", LocalDate.now(), true) );
			taskService.save( new Task(4L, "Task 4", LocalDate.now(), true) );
		};
	}

}
