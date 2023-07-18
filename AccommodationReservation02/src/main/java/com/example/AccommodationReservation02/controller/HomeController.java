package com.example.AccommodationReservation02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Home(){
		return "home";
	}
	
	@GetMapping("login")
	public String login() {
		return "/member/login"; 
	}

	@GetMapping("domesticList")
	public String list() {
		return "domesticList";
	}
	
	@GetMapping("overseaList")
	public String list2() {
		return "overseaList";
	}
	
	
	@GetMapping("accommodationInsert")
	public String accinsert() {
		return "accommodationInsert";
	}
	
	
	
	
	
	
	
	
	
}
