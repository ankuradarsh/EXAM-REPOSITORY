package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ToDo;
import com.example.demo.Service.ToDoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/todos")
public class ToDoController {
	
	private ToDoService todoService;
	
	@GetMapping
	public List<ToDo> getAllTodo() {
		return todoService.getAllTodos();
	}
	
	@PostMapping
	public void insertTodo(@RequestBody ToDo todo) {
		todoService.createTodo(todo);
	}
	
	@DeleteMapping("/delete")
	public void deleteTodo(@RequestParam("id") Integer id) {
		todoService.deleteTodo(id);
	}
	
}