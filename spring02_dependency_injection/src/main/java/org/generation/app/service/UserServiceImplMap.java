package org.generation.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.generation.app.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserServiceImplMap implements UserService {
	
	Map<Long, User> users = new HashMap<>();

	@Override
	public List<User> getAllUsers() {
		return new ArrayList<>( users.values() ) ;
	}

	@Override
	public User addUser(User user) {
		users.put( user.getId() , user);
		return user;
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
