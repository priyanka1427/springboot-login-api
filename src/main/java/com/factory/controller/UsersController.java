package com.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.dto.UsersDTO;
import com.factory.service.UsersService;
import com.factory.utilities.ApiResponse;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/users")
public class UsersController {
	
	private String entityName = "Users";
	
	@Autowired
	private UsersService usersService;
	
	/*@Autowired
	private BCryptPasswordEncoder encoder;*/
	
	@GetMapping("/findByUserName/{userName}")
	public ApiResponse<UsersDTO> findByUserName(@PathVariable String userName) {
		return new ApiResponse<>(HttpStatus.OK.value(), entityName + " Record fetched successfully.", usersService.findbyUserName(userName));
	}

}
