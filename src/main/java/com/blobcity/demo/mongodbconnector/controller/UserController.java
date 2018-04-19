package com.blobcity.demo.mongodbconnector.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blobcity.demo.mongodbconnector.model.User;
import com.blobcity.demo.mongodbconnector.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("")
	public void create(@RequestBody User user) {
		userRepository.save(user);
	}

	@GetMapping("/{id}")
	public Optional<User> read(@PathVariable String id) {
		return userRepository.findById(id);
	}
	@GetMapping("")
	public List<User> read() {
		return userRepository.findAll();
	}

	@PutMapping("")
	public void update(@RequestBody User user) {
		userRepository.save(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		userRepository.deleteById(id);
	}
	

}
