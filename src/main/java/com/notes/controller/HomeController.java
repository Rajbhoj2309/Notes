package com.notes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	
	 @GetMapping("/example")
	    public String showExamplePage() {
	        return "example"; // This refers to the "example.html" file
	    }
	 
	 @GetMapping("/sort")
	 public String sortExample() {
		 
		 return "sort";
	 }
	 
	
}
