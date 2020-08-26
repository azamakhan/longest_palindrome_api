package com.project1.rest.webservices.resfulwebservices.palindrome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeResource {
	
	@Autowired
	private PalindromeService servicePal;
	
	@GetMapping("/string-palindrome/getpal/{str}")
	public String retrievePal(@PathVariable String str) {
		return servicePal.retrievePal(str);
	}
	
	@GetMapping("/string-palindrome/createpal/{str}")
	public void createPal(@PathVariable String str) {
		servicePal.createPal(str);
	}
	
	
}
