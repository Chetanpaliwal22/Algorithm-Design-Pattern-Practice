package com.concordia.algo;

/*
 * Approach devide it in two half sort it and then merge it
 */
public class MergeSort {

	public static void main(String[] args) {

		int[] intArray = { 2, 44, 5, 9 };
	//	int[] intArray = { 2, 44};

		System.out.println("Start of the code.");
		int[] sortedArray = new int[intArray.length];
		mergeSort(intArray, sortedArray, 0, intArray.length-1);
		for (int i = 0; i < sortedArray.length; i++) {
		//	System.out.println(sortedArray[i]);
			System.out.println(intArray[i]);

		}
		// System.out.println(sortedArray[0] + " " + sortedArray[1]);
	}

	private static void mergeSort(int[] intArray, int[] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd)
			return;
		int middle = (leftStart + rightEnd) / 2;

		// Sort first half
		mergeSort(intArray, temp, leftStart, middle);
		// sort second half
		mergeSort(intArray, temp, middle + 1, rightEnd);

		// merge the two half
		mergeHalf(intArray, temp, leftStart, rightEnd);

	}

	private static void mergeHalf(int[] intArray, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;

		int size = rightEnd - leftStart + 1;

		int left = leftStart;
		int right = rightStart;

		int index = leftStart;

		while (left <= leftEnd && right <= rightEnd) {
			if (intArray[left] <= intArray[right]) {
				temp[index] = intArray[left];
				left++;
			} else {
				temp[index] = intArray[right];
				right++;
			}
			index++;
		}

		System.arraycopy(intArray, left, temp, index, leftEnd - left+1);
		System.arraycopy(intArray, right, temp, index, rightEnd - right+1);

		System.arraycopy(temp, leftStart, intArray, leftStart, size);
	}

}
