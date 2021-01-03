package com.oracle.fieldService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@GetMapping(path = "/myRoles")
	public String getMyRoles() {
		String roles = "";
		return "Roles: " + roles;
	}
}
