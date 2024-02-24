package com.selenide;

public class ReverseString {

	public static void main(String[] args) {

		// using String concationation operator
		String str = "durga prasad";
		String rev = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		String d = "katakatla";

		for (int k = d.length() - 1; k >= 0; k--) {

			System.out.println(d.charAt(k));
		}

		StringBuffer sb = new StringBuffer("AVYAIT private Limited");
		System.out.println(sb.reverse());

	}

}
