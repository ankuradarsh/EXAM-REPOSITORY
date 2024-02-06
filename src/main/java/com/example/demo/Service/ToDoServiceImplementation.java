package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.ToDo;
import com.example.demo.Repository.*;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class ToDoServiceImplementation implements ToDoService{
	private ToDoRepository toDoRepository;
	@Override
	public List<ToDo> getAllTodos() {
		// TODO Auto-generated method stub
		
		return toDoRepository.findAll();
	}

	@Override
	public ToDo getTodoById(Integer id) {
		// TODO Auto-generated method stub
		return toDoRepository.findById(id).get();
	}

	@Override
	public ToDo createTodo(ToDo todo) {
		// TODO Auto-generated method stub
		return toDoRepository.save(todo);
	}

	@Override
	public void deleteTodo(Integer id) {
		// TODO Auto-generated method stub
		toDoRepository.deleteById(id);
		
	}

}