package example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {

		// 1.Reverse a String

		String name = "naresh";

		// a.built in function
		String rev = new StringBuilder(name).reverse().toString();
		System.out.println("rev----" + rev);

		// b.traditional approach
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println("reverse----" + reverse);

		// **********************************************************************************************************

		// 2. Check if a String is a Palindrome

		String str = "madam";

		if (str.equals(new StringBuilder(str).reverse().toString())) {
			System.out.println(str + "---is a palindrome");
		} else {
			System.out.println(str + "---is not a palindrome");
		}

		String re = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			re += str.charAt(i);
		}

		if (str.equals(re)) {
			System.out.println(str + "---is a palindrome");
		} else {
			System.out.println(str + "---is not a palindrome");
		}

		// **********************************************************************************************************

		// 3.Find Factorial of a Number

		int n = 4;
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}

		System.out.println("factorial---" + fact);

		System.out.println("factorial---" + factorial(5));
		// **********************************************************************************************************

		// Fibonacci Series

		int num = 8;
		int a = 0, b = 1;

		for (int i = 1; i <= num; i++) {

			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println();

		for (int i = 0; i < num; i++) {
			System.out.print(fibonacci(i) + " ");
		}

		// **********************************************************************************************************
		// Count Occurrences of Each Character in a String
		System.out.println();

		String str1 = "Helloo";
		str1 = str1.toLowerCase();
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;

			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(c + "----count__--" + count);
			}

		}

		String str11 = "hello";
		Map<Character, Long> freq = str11.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(d -> d, Collectors.counting()));
		System.out.println(freq);
		// **********************************************************************************************************
		// Find Missing Number in Array

		int mi[] = { 1, 2, 4, 5 };
		int max = Arrays.stream(mi).max().getAsInt();
		System.out.println(max);
		int totalSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i <max-1; i++) {
			sum += i;
		}
		System.out.println("Missing num---" + (totalSum - sum));
		
		
		
		for (int i=0;i<str.length();i++)
		    for (int j=i+1;j<=str.length();j++)
		        System.out.println(str.substring(i,j));


	}

	public static int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
