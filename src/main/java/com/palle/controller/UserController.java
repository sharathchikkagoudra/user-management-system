package com.palle.controller;

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

import com.palle.dto.UserDTO;
import com.palle.entity.User;
import com.palle.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/insertUser")
	public User saveUser(@RequestBody @Valid UserDTO userDto) {
		return service.saveUser(userDto);	
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@GetMapping("/getOneUser/{id}")
	public Optional<User> getOneUser(@PathVariable int id) {
		return service.getOneUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable int id, @RequestBody UserDTO userDto) {
		return service.updateUser(id, userDto);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
		
	}

}
