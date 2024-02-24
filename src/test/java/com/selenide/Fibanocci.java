package com.selenide;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class Fibanocci {

	public static void main(String[] args) {

		Scanner sc = new Scanner("path");
		sc.useDelimiter("//Z");
		System.out.println(sc.next());

		int n = 0;
		int n1 = 1;
		int sum = 0;

		System.out.print(n + " " + n1);

		for (int i = 1; i < 10; i++) {
			sum = n + n1;

			System.out.print(" " + sum);
			n = n1;
			n1 = sum;

		}

		Random ob = new Random();
		System.out.println(ob.nextInt(1000));

		System.out.println("");
		String name = RandomStringUtils.randomNumeric(10);
		System.out.println(name);
		String name1 = RandomStringUtils.randomAlphabetic(10);
		System.out.println(name1);

		int i = 6;
		int facto = 1;

		for (int k = 1; k <= i; k++) {

			facto = facto * k;
		}

		System.out.println(facto);
	}

}
