package com.selenide;

public class CountTheNumbers {

	public static void main(String[] args) {

		int k = 125845;

		int count = 0;

		while (k > 0) {

			k = k / 10;
			count++;
		}

		System.out.println(count);

		int u = 1258465;
		int odd = 0;
		int even = 0;

		while (u > 0) {

			int i = u % 10;

			if (i % 2 == 0) {
				even++;

			} else {
				odd++;
			}

			u = u / 10;

		}

		System.out.println("even numbers are +" + even + "add odd" + odd);

		int e = 1235487;

		int some = 0;

		while (e > 0) {

			some = some + e % 10;

			e = e / 10;

		}
		System.out.println(some);

	}

}
