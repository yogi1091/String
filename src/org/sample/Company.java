package org.sample;

public class Company {

	public static void main(String[] args) {

		String s = "Java";
		String s1 = "java";
		String s2 = "Selenium";
		String s3 = "           framework";

		int length = s.length();
		System.out.println(length);

		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		int indexOf = s.indexOf('a');
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);

		int indexOf1 = s.indexOf('s');
		System.out.println(indexOf1);

		char charAt = s.charAt(3);
		System.out.println(charAt);

		boolean equals = s1.equals(s);
		System.out.println(equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);

		boolean contains = s3.contains("Frameworks");
		System.out.println(contains);

		String replace = s3.replace("Testing", "Framework");
		System.out.println(replace);

		boolean startsWith = s3.startsWith("Cucumber");
		System.out.println(startsWith);

		boolean endsWith = s3.endsWith("Framework");
		System.out.println(endsWith);

		String trim = s3.trim();
		System.out.println(trim);

		boolean empty = s3.isEmpty();
		System.out.println(empty);

	}

}
