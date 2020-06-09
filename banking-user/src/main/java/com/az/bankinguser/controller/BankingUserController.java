package com.az.bankinguser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingUserController {

	@GetMapping(path="/user")
	public String getUser() {
		return "welcome to bank";
	}
}
