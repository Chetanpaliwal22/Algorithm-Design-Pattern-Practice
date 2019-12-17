package com.concordia.algo;

//input string and length.

//output string with replaced character “ ” with %20.
//Constraint I have to use the character array.
//Optimization
//Steps
//1. Define a character array of size 3times then the first one
//2. Iterate and replace space with %20
//3. Iterate and display till you get space

public class Replace {

	public Replace() {
	}

	public static void main(String[] args) {
		Replace replace = new Replace();
		char[] charArr = { '1', '2', ' ', ' ', '5' };
		int length = 5;
		char[] replacedArr = new char[length * 3];

		replacedArr = replace.replaceTheSpace(charArr, replacedArr);

	}

	public char[] replaceTheSpace(char[] array1, char[] array2) {
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != ' ') {
				array2[j++] = array1[i];
			} else {
				array2[j++] = '%';
				array2[j++] = '2';
				array2[j++] = '0';
			}

		}
		this.printArrya(array2, j);
		return array2;
	}

	public void printArrya(char[] array2, int j) {
		for (int i = 0; i < j; i++) {
			System.out.print(array2[i]);
		}

	}
}
