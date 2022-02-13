package com.blz.java;

import java.util.Scanner;

public class PerfectNumber {
	public static int perfectNumberCheck(int num) {
		int sum = 0;
		int i = 0;
		for (i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {

				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		sum = perfectNumberCheck(num);
		if (sum == num) {
			System.out.println(num + " is a perfect number");
		} else {
			System.out.println(num + " is not a perfect number");
		}
		scanner.close();

	}

}
