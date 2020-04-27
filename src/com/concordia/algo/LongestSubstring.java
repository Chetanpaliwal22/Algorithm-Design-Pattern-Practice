package com.concordia.algo;

import java.util.*;

public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {

		HashSet<Character> h = new HashSet<Character>();

		int i = 0;
		int j = 0;
		int max = 0;

		while (j < s.length()) {
			if (!h.contains(s.charAt(j))) {
				h.add(s.charAt(j));
				// System.out.println("here1 "+h.size());
				max = Math.max(max, h.size());
				j++;
			} else {
				System.out.println("here2 " + h.size());
				h.remove(s.charAt(i));
				// System.out.println("here2 "+h.size());
				i++;
			}

			// max = Math.max(max,h.size());

		}

		return max;
	}
}