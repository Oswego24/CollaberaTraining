package com.collabera.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.collabera.dao.TodoDao;
import com.collabera.model.Todo;

@Service
@Primary
public class TodoServiceRDBMS implements TodoServiceI {
	
	@Autowired
	TodoDao todoDao;
	
	// returns all todos 
	public List<Todo> listAllTodos() throws SQLException{
		List<Todo> todo = todoDao.listAllTodos();
		return todo;
	}
	
	// return user specific todos 
	public List<Todo> listTodos(String user) throws SQLException{
		List<Todo> todo = todoDao.listAllTodos();
		return todo;
	}
	
	// return todo by id
	public Todo getTodo(int todoId) throws SQLException {
		Todo todo = todoDao.getTodo(todoId);
		return todo;
	}
	
	// add a todo to list
	@Override
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) throws SQLException{
		Todo todo = todoDao.addTodo(desc, user, targetDate, status);
		return todo;
	}

	// update a todo in the list
	public Todo editTodo(Todo todo) throws SQLException{
		Todo editTodo = todoDao.editTodo(todo);
		return editTodo;
	}
	
	// delete a todo
	public Todo deleteTodo(int todoId) throws SQLException{
		Todo deletedTodo = todoDao.deleteTodo(todoId);
		System.out.println("you pushed delete");
		return deletedTodo;
	}
	
}
