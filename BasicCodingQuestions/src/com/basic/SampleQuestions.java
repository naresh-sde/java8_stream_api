package com.basic;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleQuestions {

	public static void main(String args[]) {

		// Reverse a String without using StringBuilder.reverse()

		String name = "Naaresh";

		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println("csll--" + rev);

		// simply
		System.out.println("rev====" + new StringBuilder(name).reverse());

		// Check if a String is a palindrome.

		String act = "madam";
		String reverse = new StringBuilder(act).reverse().toString();
		if (act.equals(reverse)) {
			System.out.println("its a palindrome");

		} else {
			System.out.println("its not a palindrome");
		}

		// Count the number of vowels in a String.
		int count = 0;
		for (char c : name.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}

		}
		System.out.println("vowel count" + count);
		long cs = name.chars().distinct().filter(c -> "^aeiou".indexOf(c) != -1).count();
		System.out.println("vowel count" + cs);

		// Swap two numbers without using a third variable. a=1,b=2---->a=2,b=1

		int a = 1, b = 2;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
//		
		// with third variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

//		Find the factorial of a number using recursion.
		SampleQuestions obj = new SampleQuestions();
		System.out.println("factorial:" + obj.factorial(5));

		// using stream

		int num = 5;

		int fact = IntStream.rangeClosed(1, num).reduce(1, (c, d) -> c * d);
		System.out.println("fact----" + fact);

		// Print Fibonacci series up to N terms.

		int inp = 10;

		int x = 0, y = 1;

		for (int i = 1; i <= inp; i++) {

			System.out.print(x + " ");
			int tm = x + y;

			x = y;
			y = tm;

		}
		System.out.println();
		// recursive way

		int q = 0, r = 1;
		for (int i = 0; i < inp; i++) {
			System.out.print(obj.feb(i) + " ");

		}
		System.out.println();

		// Find the first non-repeated character in a String.

		String nonRe = "madam";
		List<Character> char1 = nonRe.chars().mapToObj(c -> (char) c).toList();

		Optional<Character> hd = char1.stream().filter(n -> Collections.frequency(char1, n) == 1).findFirst();
		System.out.println(hd.get());
	}

	public int feb(int k) {

		if (k == 0)
			return 0;
		if (k == 1)
			return 1;

		return feb(k - 1) + feb(k - 2);

	}

	public int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
