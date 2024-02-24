package com.selenide;

public class sum {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;

		int min = Integer.MIN_VALUE;

		int array[] = { 10, 50, 80, 70, 63 };

		for (int one : array) {

			if (one > max) {
				min = max;
				max = one;

			} else if (one < min && one != max) {

				min = one;

			}
		}

		System.out.println(min);

	}
}
