package com.javatest.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatest.app.DTO.UserDTO;
import com.javatest.app.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/getDetails")
	public ResponseEntity<UserDTO> getDetails(@RequestBody UserDTO userDTO) {
		return ResponseEntity.ok(userService.getDetails(userDTO));
	}

}
