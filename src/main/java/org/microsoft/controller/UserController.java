package org.microsoft.controller;

import org.microsoft.pojo.User;
import org.microsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * author @Santosh
 */

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/oneUser/{userId}")
	public User getUserById(@PathVariable Integer userId) {

		User userobj = userService.getUser(userId);

		return userobj;

	}

	@PostMapping("/creatUser")
	public String createUser(@RequestBody User user) {
		userService.addUser(user);

		return "Record Added Successfully";

	}

	@PutMapping("/update/{userId}")
	public String updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
		userService.update(user);
		
		return "Record Updated Successfully";
	}

	@DeleteMapping("/remove/{userId}")
	public String deleteUser(@PathVariable int userId) {

		userService.delete(userId);

		return "Record Deleted Successfully";
		
	}

}
