package com.motamedi.odd_sum;

public class OddSum {

	private int a;
	private int b;

	public OddSum(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculateOddSum() {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		return sum;
	}
}
