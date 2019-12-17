package com.concordia.algo;

public class CompressString {

	public CompressString() {
	}

	public static void main(String[] args) {

		String firstString = "aabbbcccdddde";

		CompressString compressString = new CompressString();

		System.out.println(compressString.compressStringMethod(firstString));
	}

	public String compressStringMethod(String firstString) {
		String finalString = "";
		char chartoPut = ' ';
		int count = 0;
		for (int i = 1; i < (firstString.length()); i++) {
			if (firstString.charAt(i) == firstString.charAt(i - 1)) {
				chartoPut = firstString.charAt(i - 1);
				count = count + 1;
			} else {
				if (count == 0) {
					finalString = finalString + firstString.charAt(i - 1);
				} else {
					finalString = finalString + firstString.charAt(i - 1) + (count + 1);
					count = 0;
				}
			}

			if (i == firstString.length() - 1) {
				if (count == 0) {
					finalString = finalString + firstString.charAt(i);
				} else {
					if (firstString.charAt(i) == firstString.charAt(i - 1)) {
						finalString = finalString + firstString.charAt(i) + (count + 1);
						count = 0;
					}
				}

			}
		}
		return finalString;
	}
}
