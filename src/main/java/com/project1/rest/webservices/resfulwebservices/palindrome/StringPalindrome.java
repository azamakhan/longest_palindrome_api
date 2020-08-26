package com.project1.rest.webservices.resfulwebservices.palindrome;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StringPalindrome {
	
	@Id
	
	private String str;
	
	private String palindrome;
	
	public StringPalindrome() {
		
	}
	
	public StringPalindrome (String str, String palindrome) {
		//this.id = id;
		this.str = str;
		this.palindrome = palindrome;
	}

	@Column(name = "palindrome", nullable = false)
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Column(name = "string", nullable = false)
	public String getPalindrome() {
		return palindrome;
	}
	
	public void setPalindrome(String palindrome) {
		this.palindrome = palindrome;
	}
	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
	@Override
	public String toString() {
		return String.format("String: %s, Palindrome: %s", str, palindrome);
	}

}
