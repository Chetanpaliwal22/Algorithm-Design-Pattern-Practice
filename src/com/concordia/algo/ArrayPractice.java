package com.concordia.algo;

import java.util.Arrays;

/*
 * Code to determine if a string has all unique characters or not. Return true or false.
 */
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "abcde";
		boolean isUniqueCharacter = checkUniqueCharacter(inputString);
		System.out.println(isUniqueCharacter);
		String inputString2 = "abcdefa";
		boolean isUniqueCharacter2 = checkUniqueCharacter(inputString2);
		System.out.println(isUniqueCharacter2);
	}

	private static boolean checkUniqueCharacter(String inputString) {
		String[] charArray = inputString.split("");
		Arrays.sort(charArray);
		int length = charArray.length;
		for(int i=0;i<length-1;i++) {
			if(charArray[i].equalsIgnoreCase(charArray[i+1])) {
				return false;
			}
		}
		return true;
	}

}
