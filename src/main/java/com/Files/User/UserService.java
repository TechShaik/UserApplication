package com.Files.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Files.User.DTOs.UserRequsetDTO;
import com.Files.User.DTOs.UserResponseDTO;

@Service
public class UserService {
     @Autowired
	private UserRepo userRepo;
	@Autowired
     private Mapper mapper;
     
	public UserResponseDTO add(UserRequsetDTO userRequsetDTO) {
	 User user = mapper.dtoTOUser(userRequsetDTO);
	 User save = userRepo.save(user);
	return  mapper.userToDto(save);
	 
		
	}

	public List<UserResponseDTO> showall() {		 
		  List<User> all = userRepo.findAll();
		  return all.stream().map(mapper::userToDto).collect(Collectors.toList());
	}
 

	public UserResponseDTO showuser(Long id) {
		  User user = userRepo.findById(id).get();
		  return mapper.userToDto(user);
		 
	}

	public String delete(long id) {
		userRepo.deleteById(id);
 		return "User Deleted Successfully";
	}

	public UserResponseDTO update(long id,UserRequsetDTO userRequsetDTO) {
		User user = userRepo.findById(id).get();
		user.setFname(userRequsetDTO.getFname());
		user.setLname(userRequsetDTO.getLname());
		user.setDob(userRequsetDTO.getDob());
		user.setPassword(userRequsetDTO.getPassword());
		user.setEmail(userRequsetDTO.getEmail());
		user.setRole(userRequsetDTO.getRole());
		user.setUpdate_date(LocalDateTime.now());
		userRepo.save(user);
		return mapper.userToDto(user);
 	}

}
