package com.cts.springsecurityjwt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "example")
@Getter
@Setter
public class User {
	
	@Id
	private String id;
	
	@Field(name = "name")
	private String userName;
	
	private String password;
}
