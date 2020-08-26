package com.project1.rest.webservices.resfulwebservices.palindrome;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

public interface PalindromeService {

	String retrievePal(String str);

	void createPal(String str);
}
