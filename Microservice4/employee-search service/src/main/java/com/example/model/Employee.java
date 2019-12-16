package com.example.model;
//import org.springframework.data.mongodb.core.mappping.Document;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="B")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
	
	private ObjectId _id;
	
	private int userId;
	
	//private int id;
	
	private String title;
	
	private String body;
	
	public String get_id() {
		return _id.toHexString(); 
	}
}
