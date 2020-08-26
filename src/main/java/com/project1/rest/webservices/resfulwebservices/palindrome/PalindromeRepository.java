package com.project1.rest.webservices.resfulwebservices.palindrome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeRepository extends JpaRepository<StringPalindrome, String>{
	
}
