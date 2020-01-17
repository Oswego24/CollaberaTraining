package com.collabera.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.collabera.model.Todo;

public interface TodoServiceI {

	// returns all todos 
	public List<Todo> listAllTodos() throws SQLException;
	
	// return user specific todos 
	public List<Todo> listTodos(String user) throws SQLException;
	
	// return todo by id
	public Todo getTodo(int todoId) throws SQLException; 
	
	// add a todo to list
	//public Todo addTodo(String user, String desc, Date targetDate, boolean status) throws SQLException;
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) throws SQLException;

	// update a todo in the list
	public Todo editTodo(Todo todo) throws SQLException;
	
	// delete a todo
	public Todo deleteTodo(int todoId) throws SQLException;

}