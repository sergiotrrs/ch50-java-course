package org.generation.app.service;


import java.util.ArrayList;
import java.util.List;

import org.generation.app.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplList implements UserService {
	
	private List<User> users = new ArrayList<>();

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User addUser(User user) {
		// TODO Verificar que el email no exista
		if (users.add(user)) {
			return user;
		}
		throw new IllegalStateException("User doesn't insert");
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
