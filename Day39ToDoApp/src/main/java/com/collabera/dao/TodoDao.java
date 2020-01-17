package com.collabera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.collabera.model.Todo;
import com.collabera.services.TodoServiceI;

@Component
public class TodoDao implements TodoServiceI {

	@Autowired
	ConnectionManager connMgr;
	//CRUD operations 
	
	//Create
	@Override
	public Todo addTodo(String desc, String user, Date targetDate, boolean status) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		//ResultSet myResult = null;
		System.out.println("You hit the add button");
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
			System.out.println("Result Set = " + result);
			
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

	//Read
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
	public Todo getTodo(int todoId) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myResult = null;
		
		try {
			myConn = DriverManager.getConnection(connectionString, username, password);
			myStmt = myConn.prepareStatement("SELECT * FROM todo WHERE id = ?");
			//System.out.println("Selecting from the database");
			myStmt.setInt(1, todoId);
			myResult = myStmt.executeQuery();
			if(myResult!=null) {
				while(myResult.next()) {
					String user = myResult.getString("user");
					String desc = myResult.getString("description");
					Date targetDate = myResult.getDate("targetDate");
					Boolean status = myResult.getBoolean("status");
					System.out.println("Got the Todo");
					return new Todo(todoId,user,desc,targetDate,status);
				}
			}
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
	public Todo editTodo(Todo todo) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myResult = null;
		
		try {
			myConn = DriverManager.getConnection(connectionString, username, password);
			myStmt = myConn.prepareStatement("UPDATE todo SET description = ?, user = ?,targetDate = ?,status = ? WHERE id = ?");
			myResult = myStmt.executeQuery();
			Todo newTodo = todo;
			myStmt.setString(1, todo.getDesc());
			myStmt.setString(2, todo.getUser());
			java.sql.Date sqlDate = new java.sql.Date(todo.getTargetDate().getTime());
			myStmt.setDate(3, sqlDate);
			myStmt.setBoolean(4, todo.isStatus());
			myResult.getBoolean("status");
			myResult.getInt("id");
			
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
	public Todo deleteTodo(int todoId) throws SQLException {
		String connectionString = "jdbc:mysql://localhost:3306/todo";
		String username="root";
		String password="root";
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myResult = null;
		System.out.println("You hit the delete button");
		try {
			myConn = DriverManager.getConnection(connectionString, username, password);
			Todo todo = getTodo(todoId);
			myStmt = myConn.prepareStatement("DELETE FROM todo WHERE id = ?");
			myStmt.setInt(1, todoId);
			int result = myStmt.executeUpdate();
			if(result>0) {
				myResult = myStmt.getResultSet();
				return todo;
			}
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

}
