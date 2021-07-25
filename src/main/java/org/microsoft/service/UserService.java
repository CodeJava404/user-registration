package org.microsoft.service;

import java.util.Optional;

import org.microsoft.pojo.User;
import org.microsoft.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author @Santosh
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User getUser(Integer userId) {

		Optional<User> getStudent = userRepository.findById(userId);
		return getStudent.get();

	}

	public User addUser(User user) {

		return userRepository.save(user);
	}

	public void update(User user) {

		userRepository.save(user);
	}

	public void delete(Integer userId) {

		userRepository.deleteById(userId);
	}

}
