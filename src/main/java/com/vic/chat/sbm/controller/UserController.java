package com.vic.chat.sbm.controller;

import com.vic.chat.sbm.domain.User;
import com.vic.chat.sbm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/greeting")
	public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello"+name;
	}
	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User user) {
		userService.addUser(user);
		return  userService.retrieveUserById(user.getUserId());
	}
	@GetMapping(value = "/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return  userService.retrieveUserById(id);
	}
	@GetMapping(value = "/getUsers")
	public List<User> getAllUser() {
		return  userService.retrieveAllUsers();
	}
}
