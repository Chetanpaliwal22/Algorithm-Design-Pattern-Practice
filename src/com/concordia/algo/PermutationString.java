package com.concordia.algo;

import java.util.Arrays;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString1 = "abcde";
		String inputString2 = "abcdk";
		boolean isPermutation = checkPermutation(inputString1, inputString2);
		System.out.println(isPermutation);
		String inputString3 = "abcde";
		boolean isPermutation2 = checkPermutation(inputString1, inputString3);
		System.out.println(isPermutation2);

	}

	private static boolean checkPermutation(String inputString1, String inputString2) {
		String[] firstStringArray = inputString1.split("");
		String[] secondStringArray = inputString2.split("");

		// if in case code wants us to check for occurance time also.
		if (firstStringArray.length != secondStringArray.length)
			return false;

		Arrays.sort(firstStringArray);
		Arrays.sort(secondStringArray);

		for (int i = 0; i < firstStringArray.length; i++) {
			if (!firstStringArray[i].equalsIgnoreCase(secondStringArray[i])) {
				return false;
			}
		}
		return true;
	}

}
