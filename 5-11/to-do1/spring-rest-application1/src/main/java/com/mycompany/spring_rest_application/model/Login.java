package com.mycompany.spring_rest_application.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Login {

	@NotNull
	@Size(min = 3, message = "first name must be atleast 3 char(s) long..")
	private String usernam;
	@NotNull
	@Size(min = 3, message = "last name must be atleast 3 char(s) long..")
	private String password;
	

}
