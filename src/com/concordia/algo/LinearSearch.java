package com.concordia.algo;

public class LinearSearch {

	static int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

	public static void main(String[] Arg) {
		System.out.println("Start of the code");
		System.out.println("Lenght of Array: " + array.length);

		System.out.println("Search Integer 40: " + searchInteger(40));
		System.out.println("Search Integer 30: " + searchInteger(300));

		
		System.out.println("End of the code");
	}

	public static int searchInteger(int searchInteger) {

		for (int i = 0; i < array.length; i++) {
			if (searchInteger == array[i]) {
				return i;
			}
		}
		return -1;
	}
}
