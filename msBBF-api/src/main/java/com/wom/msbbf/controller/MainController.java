package com.wom.msbbf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


/*
* autor usersad
*/
@RequestMapping("/mainbbf")
public interface MainController {

	@GetMapping(value = "/getComuna", produces = "application/json")
	public String getComuna();
}
