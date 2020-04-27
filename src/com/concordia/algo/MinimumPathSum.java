package com.concordia.algo;

public class MinimumPathSum {

	public int minPathSum(int[][] grid) {

		int[][] arr = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (i == 0 && j == 0) {
					arr[i][j] = grid[0][0];
				} else {
					arr[i][j] = grid[i][j] + Math.min(i - 1 >= 0 ? arr[i - 1][j] : Integer.MAX_VALUE,
							j - 1 >= 0 ? arr[i][j - 1] : Integer.MAX_VALUE);
				}
			}
		}

		return arr[grid.length - 1][grid[0].length - 1];
	}
}
