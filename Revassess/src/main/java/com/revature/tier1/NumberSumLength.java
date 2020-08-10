package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {

		String s = String.valueOf(num);
		String[] a = s.split("(?!^)");
		long len = s.length();

		long total = 0;

		for (String astring : a) {
			total += Math.pow(Long.parseLong(astring), len);
		}


		return total == num;
	}
}
