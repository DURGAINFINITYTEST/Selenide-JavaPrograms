package com.selenide;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws Exception {
		File f = new File(
				"C:\\Users\\katak\\eclipse-workspace\\SelenidePractice\\src\\test\\java\\com\\folders\\svs.txt");
		Scanner sc = new Scanner(f);
		sc.useDelimiter("//Z");
		System.out.println(sc.next());

		int[] arr = { 3, 7, 1, 9, 10, 2 };

		int max1 = Integer.MIN_VALUE; // 3 //7 //9 //10 //
		int max2 = Integer.MIN_VALUE; // 3 //7 //9

		for (int num : arr) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max2 = num;
			}
		}

		long maxProduct = max1 * max2;

		System.out.println("The two numbers with maximum product are: " + max1 + " and " + max2);
		System.out.println("The maximum product is: " + maxProduct);

		int l[] = { 10, 50, 80, 70, 60, 40, 20, 5 };
		int max = l[0];
		int min = l[0];

		for (int f1 = 1; f1 < l.length; f1++) {

			if (l[f1] > max) {

				max = l[f1];

			}

			if (l[f1] < min) {

				min = l[f1];

			}

		}

		System.out.println(max);
		System.out.println(min);

	}

}
