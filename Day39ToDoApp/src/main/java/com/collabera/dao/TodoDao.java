package com.collabera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.collabera.model.Todo;
import com.collabera.services.TodoServiceI;

@Component
public class TodoDao implements TodoServiceI {

	//CRUD operations 
	
	//Create
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myResult = null;
		
		try {
			//1. Open the connection
			myConn = DriverManager.getConnection(connectionString, username, password);
			//2. Write the prepared sql statements
				//a. Statement
					//i. Insert into todo('Column Names') values ('')
				//b. Prepared Statements
			myStmt = myConn.prepareStatement("INSERT INTO todo(description,user,targetDate,status)" + "VALUES(?,?,?,?)");
			myStmt.setString(1, desc);
			myStmt.setString(2, user);
			java.sql.Date sqlDate = new java.sql.Date(targetDate.getTime());
			myStmt.setDate(3, sqlDate);
			myStmt.setBoolean(4, status);
				//c. Callable Statements
					//ii. Stored Procedures
			//3. Execute
			int result = myStmt.executeUpdate();
			System.out.println(result);
			
			//4. Process
			while(result>0) {
				return new Todo(1,user,desc,targetDate,status);
			}
			//5. Close Connection
			return null;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(myStmt!=null) {
				myStmt.close();
			}
			if(myConn!=null) {
				myConn.close();
			}
		}
		return null;
	}

	@Override
	public List<Todo> listAllTodos() throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
			
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myResult = null;
			
		myConn = DriverManager.getConnection(connectionString, username, password);
			
		myStmt = myConn.prepareStatement("SELECT * FROM todo");
		
		myResult = myStmt.executeQuery();
		
		List<Todo> todos = new ArrayList<Todo>();
		
		while(myResult.next()) {
			todos.add((new Todo(myResult.getInt("id"),
								myResult.getString("description"),
								myResult.getString("user"),
								myResult.getDate("targetDate"),
								myResult.getBoolean("status"))));
		}
		
		return todos;
	}
	@Override
	public List<Todo> listTodos(String user) throws SQLException {
		
		return null;
	}
	@Override
	public Todo getTodo(int todoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo editTodo(Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Todo deleteTodo(int todoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
