package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

// import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	private UserRepository repo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	// Getting data
	@PostMapping("/register")
	public String register(@ModelAttribute UserDetails u, HttpSession session) {

		repo.save(u);
		
     	session.setAttribute("successMessage", "User registered successfull!");

		System.out.println(u);
		return "redirect:/";
	}
}
