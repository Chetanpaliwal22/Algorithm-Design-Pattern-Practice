package com.concordia.algo;

//input: two string

//no constraint
//output true false
//logic make two local variables and then based on that check if it is rotation or not.

public class StringRotation {

	public StringRotation() {
	}

	public static void main(String[] args) {
		StringRotation stringRotation = new StringRotation();
		System.out.println(stringRotation.isRotation("aaavc", "cvaaa"));
		System.out.println(stringRotation.isSubString("abcdef", "def"));
	}

	public boolean isRotation(String firstString, String secondString) {
		int lengthFirst = firstString.length();
		int lengthSecond = secondString.length();

		if (lengthFirst != lengthSecond)
			return false;

		int i = 0;
		int j = lengthSecond - 1;

		while (i < lengthFirst & j >= 0) {
			if (firstString.charAt(i) != secondString.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public boolean isSubString(String firstString, String secondString) {

		int lengthFirst = firstString.length() - 1;
		int lengthSecond = secondString.length() - 1;

		int i = 0;
		int j = 0;
		while (i < lengthFirst & j < lengthSecond) {
			if (secondString.charAt(j) == firstString.charAt(i)) {
				i++;
				j++;
			} else if (secondString.charAt(j) != firstString.charAt(i)) {
				i++;
			}
		}
		if (j == lengthSecond) {
			return true;
		}
		return false;
	}
}
