package org.generation.app.util;

public class Palindrome {
	
	
	public boolean isPalindrome(String text) {
		String cleanedText = text.replaceAll(" ", "").toUpperCase();
		String reversedText = new StringBuilder(cleanedText).reverse().toString();
		return cleanedText.equals(reversedText);
			
	}
	
	public boolean isAlmostPalindrome(String text) {		
		String cleanedText = text.replaceAll(" ", "").toUpperCase();
		String reversedText = new StringBuilder(cleanedText).reverse().toString();
		int diffCount = 0;
		
		for(int i = 0; i < cleanedText.length()/2 ; i++) {
			char charOfCleanedText = cleanedText.charAt(i);
			char charOfreversedText = reversedText.charAt(i);
			if( charOfCleanedText != charOfreversedText ) {
				if (++diffCount > 1 ) {
					break;
				}
			}
		}
		return diffCount == 1;	
	}
	
}
