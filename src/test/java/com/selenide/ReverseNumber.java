package com.selenide;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 1234578;
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		System.out.println(sb.reverse());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;

		}

		System.out.println(rev);

	}

}
