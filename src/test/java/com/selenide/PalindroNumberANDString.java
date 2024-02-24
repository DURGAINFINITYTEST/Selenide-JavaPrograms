package com.selenide;

import java.util.Scanner;

public class PalindroNumberANDString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int rev = 0;
		int orgrev = rev;

		while (num != 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;
		}

		System.out.println(rev);

		if (num == orgrev) {
			System.out.println("palindrom number");
		} else {
			System.out.println("this is not palindrom number");
		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc1.next();

		String org = name;
		String revname = " ";

		for (int k = name.length() - 1; k >= 0; k--) {

			revname = revname + name.charAt(k);

		}
		if (name.equals(org)) {
			System.out.println("palindrom String ");
		} else {
			System.out.println("this is not a palindrom String ");
		}

	}

}