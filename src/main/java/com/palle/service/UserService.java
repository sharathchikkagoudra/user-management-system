package com.palle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.dto.UserDTO;
import com.palle.entity.User;
import com.palle.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User saveUser(UserDTO userDto) {
		User user = User.build(0, userDto.getName(), userDto.getEmail(), userDto.getMobile(), userDto.getAge(), userDto.getNationality());
		return repository.save(user);
	}
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
	public Optional<User> getOneUser(int id) {
		return repository.findById(id);
	}
	
	public String updateUser(int id, UserDTO newUser) {
		Optional<User> opt = repository.findById(id);
		
		if(opt.isPresent()) {
			User existingUser = opt.get();
			
			existingUser.setName(newUser.getName());
			existingUser.setEmail(newUser.getEmail());
			existingUser.setMobile(newUser.getMobile());
			existingUser.setAge(newUser.getAge());
			existingUser.setNationality(newUser.getNationality());
			
			repository.save(existingUser);
			
			return "User with id "+id+" successfully Updated";
		}
		return "User with id "+id+" doesn't exist";
	}
	
	public String deleteUser(int id) {
		Optional<User> opt = repository.findById(id);
		
		if(opt.isPresent()) {
			User user = opt.get();
			repository.delete(user);
			return "User with id "+id+" has successfully deleted";
		}
		return "User with id "+id+" doesn't exist";
		
	}

}
