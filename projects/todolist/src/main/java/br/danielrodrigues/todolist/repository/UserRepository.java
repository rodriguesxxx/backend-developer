package br.danielrodrigues.todolist.repository;

import br.danielrodrigues.todolist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
