package com.concordia.algo;

import java.util.*;

class SellPurchase {
	public int maxProfit(int[] prices) {

		if (prices.length == 0) {
			return 0;
		}

		int pur = prices[0], sell = 0, profit = 0;

		for (int i = 1; i < prices.length; i++) {

			sell = prices[i];
			if (sell - pur > 0) {
				profit += (sell - pur);
			}
			pur = sell;
		}
		return profit;
	}
}
