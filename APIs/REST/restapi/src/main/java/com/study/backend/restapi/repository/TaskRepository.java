package com.study.backend.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.backend.restapi.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{}
