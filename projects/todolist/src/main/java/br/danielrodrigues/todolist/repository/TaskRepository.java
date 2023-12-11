package br.danielrodrigues.todolist.repository;

import br.danielrodrigues.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {}
