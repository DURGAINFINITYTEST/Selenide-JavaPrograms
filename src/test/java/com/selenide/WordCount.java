 package com.selenide;

public class WordCount {

	public static void main(String[] args) {
		String text = "This is a sample sentence.";

		int wordCount = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isLetterOrDigit(text.charAt(i))) {

			} else {

				wordCount++;

			}
		}

		System.out.println("Word count: " + wordCount);

		String name = "durga prasad";
		String String = name.replace("a", "");
		System.out.println(String);
	}

}
