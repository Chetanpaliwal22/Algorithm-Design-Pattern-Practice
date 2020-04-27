package com.concordia.algo;

import java.util.*;

class DiagonalSorting {
	public int[][] diagonalSort(int[][] mat) {

		int row = mat.length;
		int col = mat[0].length;

		int rowindex = 0;
		int i = 0, j = 0;

		int startindex = (row - 1) * -1;
		List<List<Integer>> listInt = new ArrayList<List<Integer>>();

		while (startindex < col) {
			if (startindex <= 0) {
				i = startindex * -1;
				rowindex = 0;
			} else {
				i = 0;
			}

			List<Integer> list = new ArrayList<Integer>();
			j = rowindex;
			while (i < row && j < col) {
				// System.out.print(mat[i][j]+" ");
				list.add(mat[i][j]);
				i++;
				j++;
			}
			Collections.sort(list);
			listInt.add(list);
			// System.out.println();
			startindex++;
			rowindex++;
		}

		startindex = (row - 1) * -1;
		rowindex = 0;
		i = 0;
		j = 0;

		int mainind = 0;
		while (startindex < col) {
			if (startindex <= 0) {
				i = startindex * -1;
				rowindex = 0;
			} else {
				i = 0;
			}

			j = rowindex;
			int ind = 0;
			List<Integer> listt = listInt.get(mainind);
			while (i < row && j < col) {
				mat[i][j] = listt.get(ind);
				System.out.print(mat[i][j]);
				i++;
				j++;
				ind++;
			}
			System.out.println();
			startindex++;
			rowindex++;
			mainind++;
		}

		return mat;
	}
}
