package com.leseanbruneau.repository;

import org.springframework.data.repository.CrudRepository;

import com.leseanbruneau.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
