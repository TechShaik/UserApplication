package com.Files.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.Files.User.DTOs.UserRequsetDTO;
import com.Files.User.DTOs.UserResponseDTO;

@Component
public class Mapper {

	public UserResponseDTO userToDto(User user) {
		UserResponseDTO userResponseDTO =new UserResponseDTO();
		userResponseDTO.setId(user.getId());
		userResponseDTO.setFname(user.getFname());
		userResponseDTO.setLname(user.getLname());
		userResponseDTO.setEmail(user.getEmail());
		userResponseDTO.setRole(user.getRole());
		userResponseDTO.setReg_date(LocalDate.now());
		userResponseDTO.setUpdate_date(user.getUpdate_date());
 	return userResponseDTO;
	}
	
	
	public User dtoTOUser(UserRequsetDTO userRequsetDTO) {
		User user =new User();
		user.setFname(userRequsetDTO.getFname());
		user.setLname(userRequsetDTO.getLname());
		user.setDob(userRequsetDTO.getDob());
		user.setUpdate_date(LocalDateTime.now());
		user.setPassword(userRequsetDTO.getPassword());
		user.setEmail(userRequsetDTO.getEmail());
		user.setRole(userRequsetDTO.getRole());
		user.setUpdate_date(LocalDateTime.now());
 		return user;
	}
}
