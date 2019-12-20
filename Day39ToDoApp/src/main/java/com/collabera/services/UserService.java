package com.collabera.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.collabera.model.User;

@Service
public class UserService implements UserDetailsService{

	private static List<User> users = new ArrayList<User>();
	private static int userId = 4;
	static {
		users.add(new User(1, "admin", "admin", "Oscar Holloway", "ADMIN"));
		users.add(new User(2, "Oscar", "123", "Oscar Holloway", "USER"));
		users.add(new User(3, "bill1993", "1993", "Bill Smith", "USER"));
	}
	//return all users
	public List<User> listAllUsers(){
		return users;
	}
	//return a specific user
	public User listUsers(String username){
		
		for(User user: users) {
			if(user.getUserName().equals(username)) {
				return user;
			}
		}
		return null;
	}
	//return by id
	public User getUser(int userId) {
		Optional<User> tempUser = users.stream()
				.filter(user->user.getId() == userId)
				.findFirst();
		return tempUser.get();
	}
	//add a user
	public User addUser(String username, String pw, String fullName, String roles){
		User user = new User(userId++, username, pw, fullName, roles);
		users.add(user);
		return user;
	}
	//update a user
	public User editUser(User user){
		deleteUser(user.getId());
		users.add(user);
		return user;
	}
	//delete a user
	public User deleteUser(int userId){
		Optional<User> tempUser = users.stream()
				.filter(user->user.getId() == userId)
				.findFirst();
		
		if(tempUser.isPresent()) 
			users.remove(tempUser.get());
		
		return tempUser.get();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = listUsers(username);
		
		UserBuilder userBuilder = null;
		UserDetails userDetails = null;
		if(user!=null) {
			userBuilder = org.springframework.security.core.userdetails.User.withUsername(user.getUserName());
			userBuilder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
			userBuilder.roles(user.getRoles());
			
			userDetails = userBuilder.build();
			
			return userDetails;
		}else {
			throw new UsernameNotFoundException("User Does Not Exist");
		}
		
	}
}