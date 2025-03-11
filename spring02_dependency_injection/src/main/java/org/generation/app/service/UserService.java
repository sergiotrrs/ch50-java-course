package org.generation.app.service;

import java.util.List;

import org.generation.app.model.User;

public interface UserService {
	
	List<User> getAllUsers();
	User addUser( User user);
	void removeUser(User user);
	int size();
	User getUser(int userId );

}
