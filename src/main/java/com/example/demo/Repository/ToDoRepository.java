package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

}
