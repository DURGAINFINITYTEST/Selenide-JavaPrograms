package com.selenide;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int k = 20;

		System.out.println("before swapping i and k values is " + i + "and " + k);
		int c = i;
		i = k;
		k = c;
		System.out.println("after swapping i and k values is " + i + "and " + k);

		int p = 50;
		int q = 60;
		System.out.println("before swapping i and k values is " + p + "and " + q);

		p = p + q;
		q = p - q;
		p = p - q;

		System.out.println("after swapping i and k values is " + p + "and " + q);

	}

}
