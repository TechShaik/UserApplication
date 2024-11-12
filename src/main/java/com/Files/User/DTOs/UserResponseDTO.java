package com.Files.User.DTOs;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
	private long id;
	private String fname;
	private String lname;
	private String email;
	private String role;
	private LocalDate reg_date;
	private LocalDateTime update_date;

}
