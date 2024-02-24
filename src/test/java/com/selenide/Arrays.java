package com.selenide;

public class Arrays {

	public static void main(String[] args) {

		int[] num = { 1, 5, 6, 87, 5, 5 };

		int sum = 0;

		for (int one : num) {
			sum = sum + one;
		}

		System.out.println(sum);

		int[] numbers = { 10, 5, 7, 8, 2, 9, 5, 4 };

		int odd = 0;
		int even = 0;

		for (int one : numbers) {
			if (one % 2 == 0) {
				even++;

			} else {
				odd++;

			}
		}
		System.out.println("even numbers count " + even);
		System.out.println("odd  numbers count " + odd);

		int[] l = { 10, 20, 50, 80, 40, 90, 50 };

		int max = 0;

		for (int onebyone : l) {

			if (onebyone > max) {
				max = onebyone;
			}

		}

		System.out.println(max);

		String name[] = { "durga", "prasad", "durga", "varun" };

		for (int i = 0; i < name.length; i++) {

			for (int j = i+1; j < name.length; j++) {

				if (name[i] == name[j]) {

					System.out.println(name[i]);

				}

			}

		}

	}

}
