package com.project1.rest.webservices.resfulwebservices.palindrome;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class PalindromeDaoService {
	private int count = 2;
	
	private static List<StringPalindrome> palStrList = new ArrayList<StringPalindrome>();
	
//	static {
//		palStrList.add(new StringPalindrome(1, "abcdnitincrte", "nitin"));
//		palStrList.add(new StringPalindrome(2, "dfjiounnaabccbaa", "aabccbaa"));
//	}
//	
//	public StringPalindrome save(StringPalindrome inputPalStr) {
//		if(inputPalStr.getId()!=count) {
//			inputPalStr.setId(++count);
//		}
//		palStrList.add(inputPalStr);
//		return inputPalStr;
//	}
	
	public StringPalindrome findPal(String str) {
		for(StringPalindrome strPal : palStrList) {
			if(strPal.getStr().equals(str)) {
				return strPal;
			}
		}
		return null;
	}
	
}
