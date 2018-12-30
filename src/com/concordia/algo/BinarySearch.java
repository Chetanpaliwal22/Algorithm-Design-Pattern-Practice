package com.concordia.algo;

public class BinarySearch {

	static int[] arrayInteger = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
	static int length = arrayInteger.length;

	public static void main(String[] Arg) {
		System.out.println("Binary Search Program Starts here.");
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.searchInteger(0, length - 1, 200));
	}

	public int searchInteger(int left, int right, int searchInt) {

		int mp = left + (right - left) / 2;
		if (mp < length - 1) {
			if (arrayInteger[mp] == searchInt) {
				return mp;
			} else if (arrayInteger[mp] < searchInt) {
				return searchInteger(mp + 1, length - 1, searchInt);
			} else if (arrayInteger[mp] > searchInt) {
				return searchInteger(0, mp - 1, searchInt);
			}
		}
		return -1;
	}

}
