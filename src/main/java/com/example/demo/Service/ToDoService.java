package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.ToDo;

@Service
public interface ToDoService {
	ToDo createTodo(ToDo todo);
	ToDo getTodoById(Integer id);
//	ToDo updateTodo(Integer id, ToDo todo);
	List<ToDo> getAllTodos();
	void deleteTodo(Integer id);
}
