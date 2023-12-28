package com.api.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 5, message = "Name mus be of length 5.")
	private String name;
	
	@Email(message = "Email is invalid")
	private String email;
	
	@NotEmpty
	@Size(min = 5, message = "Password mus be of length 5.")
	//@Pattern(regexp = "")
	private String password;
	
	@NotEmpty
	private String about;
	
}
