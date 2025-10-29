package com.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImportantQuestionsOnstreams {

	public static void main(String[] args) {

		// fine the word that has the highest length
		String s = "I am learning Streams API in Java";

		String maxS = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).get();
		System.out.println(maxS);

		List<String> sm = Arrays.asList("I am learning Streams API in Java", "I am learning StreamsJava8 API in Java",
				"dvhjsdb");

		Stream<Object> mx = sm.stream()
				.map(n -> Arrays.stream(n.split(" ")).max(Comparator.comparingInt(String::length)).get());
		System.out.println(mx.toList());

		// remove duplicates char from a string

		String nam = "abaacdeffghhijk";

		nam.chars().distinct().mapToObj(x -> (char) x).distinct().forEach(System.out::print);

		System.out.println();
		Arrays.stream(nam.split("")).distinct().forEach(System.out::print);
		System.out.println();

		// find second highest word in a string
		String secHig = "I am learning Streams API in Java Java";

		String wr = Arrays.stream(secHig.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1)
				.findFirst().get();

		System.out.println(wr);

		// find second highest word length in a string
		int jkjk = Arrays.stream(secHig.split(" ")).map(n -> n.length()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(jkjk);

		// number occurrences of each word in a string

		Map<String, Long> nk = Arrays.stream(secHig.split(" "))
				.collect(Collectors.groupingBy(m -> m, Collectors.counting()));
		System.out.println(nk);

		// find the word with specified number of vowels in String

		Arrays.stream(s.split(" ")).filter(n -> n.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.forEach(System.out::println);

		// OR
		System.out.println();

		Arrays.stream(s.split(" ")).filter(word -> word.chars().filter(n -> "^aeiouAEIOU".indexOf(n) >= 0).count() == 2)
				.forEach(System.out::println);

		// given a list of integers , divide it into two lists are having an even and
		// odd number

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Map<Boolean, List<Integer>> j = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(j);

		// without key
		List<List<Integer>> jk = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0))
				.entrySet().stream().map(x -> x.getValue()).toList();
		System.out.println(jk);

		// find the number of occurrences of each character in a string
		String numOc = "Mississippi";

		Map<String, Long> x = Arrays.stream(numOc.split(""))
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println(x);

		// print number in highest to lowest and vice versa from an array

		Arrays.stream(arr).mapToObj(v -> v).sorted(Collections.reverseOrder()).forEach(System.out::print);
		System.out.println();

		System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList());

		// sum of unique numbers in an array

		int sum = Arrays.stream(arr).distinct().sum();
		System.out.println(sum);

		// non repeating char in a string

		String nonRe = "hello world";
		Optional<String> ch = Arrays.stream(nonRe.split("")).filter(b -> nonRe.indexOf(b) == nonRe.lastIndexOf(b))
				.skip(1).findFirst();
		System.out.println(ch.get());

		// Or

		List<Character> listChar = nonRe.chars().mapToObj(c -> (char) c).toList();
		Optional<Character> kl = listChar.stream().filter(m -> Collections.frequency(listChar, m) == 1).skip(1).findFirst();
		System.out.println(kl.get());
	}

}
