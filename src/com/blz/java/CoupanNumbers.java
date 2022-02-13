package com.blz.java;

import java.util.Random;
import java.util.Scanner;

public class CoupanNumbers {
	public static boolean isPresent(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("how many random numbers do you\r\n" + "need to generate a distinct coupon number?");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int randomNum = 0;
		int arr[] = new int[size];
		Random coupon = new Random();
		boolean ret;

		for (int i = 0; i < arr.length; i++) {
			randomNum = coupon.nextInt(100);
			ret = isPresent(arr, randomNum);
			if (ret != true) {
				arr[i] = randomNum;
			} else {
				--i;
			}
		}
		System.out.println("The random numbers generated are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		scanner.close();
	}

}
