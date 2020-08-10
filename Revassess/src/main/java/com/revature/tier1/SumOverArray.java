package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {

		int total = 0;

		for (int i : arr) {
			total += i;
		}

		return total;
	}
}
