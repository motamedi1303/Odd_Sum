package com.motamedi.odd_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<OddSum> oddSumList = new ArrayList<OddSum>();
		int t = 0;
		
		System.out.println("Please enter number of test cases : ");
		t = readNumber();
		
		for (int i = 0; i < t; i++) {
			int a = readNumber();
			int b = readNumber();
			OddSum oddSum = new OddSum(a, b);
			oddSumList.add(oddSum);
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println("Case " + (i + 1) + ": " + oddSumList.get(i).calculateOddSum());
		}
	}

	private static int readNumber() {
		int num = 0;
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				num = in.nextInt();
				return num;
			} else {
				in.next();
				System.out.println("Input value is not valid number, please enter again (0<=number<=100)");
			}
		}
		return num;
	}

}
