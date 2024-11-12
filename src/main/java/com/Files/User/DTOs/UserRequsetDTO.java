package com.Files.User.DTOs;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequsetDTO {

	private String fname;
	private String lname;
	private LocalDate dob;
	private String password;
	private String email;
	private String role;

}
