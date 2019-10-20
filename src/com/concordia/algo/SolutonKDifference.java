package com.concordia.algo;

import java.util.Arrays;

public class SolutonKDifference {

	static int k = 2;
	static int[] arr = { 1, 5, 3, 4, 2 };

	public static void main(String[] args) {

		int count = pairs(k, arr);
		int countOpti = pairsOptimized(k, arr);
		System.out.println("Count: " + count);
		System.out.println("Count Opti: " + countOpti);
	}

	// Brute Force method.
	static int pairs(int k, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] - arr[j] == k) {
						count++;
					}
				}
			}
		}
		return count;
	}

	// optimized one.
	static int pairsOptimized(int k, int[] arr) {
		int count = 0;
		int i = 0, j = 1;
		int length = arr.length;
		Arrays.sort(arr);
		while (i < length - 1 /* && j < length */) {
			int diff = arr[j] - arr[i];
			//System.out.println("diff " + diff);
			if (diff == k) {
				count++;
				i++;
			} else if (diff < k) {
			//	System.out.println(diff + " 1 ");
				if (j < length - 1)
					j++;
				else {
					i++;
				}
			} else if (diff > k) {
				//System.out.println(diff + " 2 ");
				i++;
			} else {
			//	System.out.println("in else");
			}
		}

		return count;
	}

}
