package com.concordia.algo;

public class DecryptString {

	public String freqAlphabets(String s) {
		String result = "";

		String[] arr = { "#", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '#') {
				result += String.valueOf(arr[Integer.parseInt(s.substring(i - 2, i))]);
				i = i - 2;
			} else {
				result += String.valueOf(arr[Integer.parseInt(String.valueOf(s.charAt(i)))]);
			}
		}
		StringBuilder sb = new StringBuilder(result);
		return sb.reverse().toString();

	}
}
