package com.selenide;

import java.util.HashSet;
import java.util.Set;

public class Nonrepitativechar {

	public static void main(String[] args) {

		String input = "aabbccddef";
		char cha[] = input.toCharArray();
		Set<Character> repetitive = new HashSet<>();
		Set<Character> nonRepetitive = new HashSet<>();

		for (char c : cha) {
			if (!nonRepetitive.add(c)) {
				repetitive.add(c);
			}
		}

		System.out.println("Repetitive characters: " + repetitive);
		nonRepetitive.removeAll(repetitive);
		System.out.println("Non-repetitive characters: " + nonRepetitive);

		String name = "nmfdjkdfvkj njndfs jnjds";
		name = name.concat("hhfbdjdurga pras");
		System.out.println(name);

		String na = "durga prasad";
		String sub = "prasad";

		int index = na.indexOf(sub);

		if (index > -1) {
			System.out.println(sub + "  available at  :" + index + " index Postion");

		}

	}

}
