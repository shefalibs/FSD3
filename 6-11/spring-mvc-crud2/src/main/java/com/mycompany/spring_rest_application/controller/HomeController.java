package com.mycompany.spring_rest_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.spring_rest_application.dao.ToDoDAO;

@Controller
public class HomeController {
	

	@RequestMapping(value="/")
	public String test(){
		return "home";
	}
}
