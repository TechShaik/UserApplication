package com.Files.User;

import java.util.List;

import org.apache.catalina.realm.AuthenticatedUserRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.Files.User.DTOs.UserRequsetDTO;
import com.Files.User.DTOs.UserResponseDTO;

@RestController
 public class UserController {
    
	@Autowired
	private UserService userService; 
	
	@GetMapping
	public String UW() {
		return "Hello User please Register First";
	}
	@PostMapping("/reg")
	public UserResponseDTO regUSer(@RequestBody UserRequsetDTO userRequsetDTO) {
	   return userService.add(userRequsetDTO);	
	}
	
	@GetMapping("/users")
	public List<UserResponseDTO> showall() {
		return userService.showall();
	}
	
	@GetMapping("/user/{id}")
	public UserResponseDTO showUser(@PathVariable long id) {
		return userService.showuser(id);
			
		}
	@PutMapping("/update/{id}")
	public UserResponseDTO update(@PathVariable long id,@RequestBody UserRequsetDTO userRequsetDTO) {
		return userService.update(id,userRequsetDTO);
	}
		
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable long id) {
			return userService.delete(id);
		}
	
}
