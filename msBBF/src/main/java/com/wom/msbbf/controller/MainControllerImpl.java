package com.wom.msbbf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.wom.msbbf.controller.MainController;
import com.wom.msbbf.tmf.service.MainService;

import io.swagger.annotations.Api;

/*
* autor usersad
*/
@RestController
@CrossOrigin(origins = "*")
@Api(value = "API Users - Sieca")
public class MainControllerImpl extends HandleErrorControllerImpl implements MainController {

	@Autowired
	private MainService mainService;
	
	public String getComuna() {
		return mainService.getComuna();
	}
}
