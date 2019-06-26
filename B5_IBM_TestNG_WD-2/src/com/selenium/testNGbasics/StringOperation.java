package com.selenium.testNGbasics;

public class StringOperation {
	public  int findLenght(String value) {
		return value.length();
	}

	public  boolean checkPalindrome(String value) {
		String reverse = new StringBuffer(value).reverse().toString();
		if(value.equals(reverse))
			return true;
		else
			return false;
	}

}
