package com.project1.rest.webservices.resfulwebservices.palindrome;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PalindromeServiceImp implements PalindromeService{
	
	@Autowired
	private PalindromeRepository palRepository;
	
	public String retrievePal(String str){
		Optional<StringPalindrome>  sp =  palRepository.findById(str);
		if(!sp.isPresent()) {
			return null;
		}
		StringPalindrome pal = sp.get();		
		return pal.getPalindrome();
	}

	public void createPal(String str) {
		String pal = longestPalindrome(str);
		
		StringPalindrome sp = new StringPalindrome(str, pal);		
		palRepository.save(sp);
	}
	
	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}
	 
		if (s.length() == 1) {
			return s;
		}
	 
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
	
}
