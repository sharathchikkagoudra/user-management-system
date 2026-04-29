package com.palle.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserDTO {
	
	@NotNull(message = "Name cann't be null ")
	private String name;
	@Email(message = "mail cann't be without @ symbol")
	private String email;
	@Pattern(regexp = "^\\d{10}$")
	private String mobile;
	@Min(18)
	@Max(60)
	private int age;
	@NotEmpty(message = "Nationality cann't be null")
	private String nationality;
}
