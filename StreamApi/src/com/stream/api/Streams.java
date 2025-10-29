package com.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		List<String> name = List.of("NAGULA", "naagula", "PavanReddy", "ANIL");

		List<String> sorted = name.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println("****************************" + sorted.reversed().get(0));

		// name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		List<String> sortedReverse = name.stream().sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList());

		System.out.println(sortedReverse);

		name.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

		record Person(String name, int age) {
		}

		Stream.of(new Person("Naresh", 30), new Person("Surech", 20), new Person("Ravi", 50))
				.sorted(Comparator.comparing(Person::name).thenComparing(Person::age)).forEach(System.out::println);

		Stream.of("a", "b", "c").peek(s -> System.out.println("Debug: " + s)).forEach(s -> {
		});

		Optional<Integer> sum = Stream.of(1, 2, 3).reduce(Integer::sum);
		System.out.println(sum.get());

		List<String> list = Stream.of("a", "b", "c", "a").collect(Collectors.toList());
		System.out.println(list);

		Set<String> lista = Stream.of("a", "b", "c", "a").collect(Collectors.toSet());
		System.out.println(lista);

		List<String> listaa = Stream.of("Naresh", "Nagula", "suresh", "OAP")
				.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(listaa);

		List<String> namees = Arrays.asList("Naresh", "Nagula", "suresh", "OAP");
		Map<String, Integer> map = namees.stream().collect(Collectors.toMap(namne -> namne, // key
				String::length // value
		));

		System.out.println(map); // {naresh=6, yadav=5}

		List<String> rmn = Arrays.asList("Naresh", "Nagula", "suresh", "OAP");

		Optional<String> sdbkjv = rmn.stream().min(Comparator.comparingInt(String::length));

		System.out.println("Min----" + sdbkjv.get());

		// find max number in an collection
		List<Integer> num = Arrays.asList(1, 89, -24, 61, 89);
		int max = num.stream().max(Integer::compare).get();
		int min = num.stream().min(Integer::compare).get();
		System.out.println(max);
		System.out.println(min);

		int sumOfNum = num.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sumOfNum);

		// list of posittive num
		List<Integer> listOfPos = num.stream().filter(n -> n > 0).toList();
		System.out.println("listOfPos" + listOfPos);

		double avgg = num.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(avgg);

		boolean positive = num.stream().allMatch(n -> n > 0);
		System.out.println(positive);

		// uppercase
		List<String> namesss = Arrays.asList("naresh", "naguLLa", "JHVBKJjkjk");

		List<String> upStr = namesss.stream().map(String::toUpperCase).toList();
		System.out.println(upStr);

		List<Integer> sortedList = num.stream().sorted().toList();
		System.out.println(sortedList);

		long count = num.stream().filter(n -> n > 5).count();
		System.out.println(count);

		List<Integer> dist = num.stream().distinct().toList();
		System.out.println(dist);

		int sumRedu = num.stream().reduce(0, (a, b) -> a + b);

		List<Integer> squ = num.stream().map(n -> n * n).toList();

		System.out.println(squ);
		// or

		int sumReduWitoutLambda = num.stream().reduce(Integer::sum).get();

		// we can use reduce(Integer::sum).get() or reduce(0,Integer::sum)
		System.out.println("sumReduWitoutLambda---" + sumReduWitoutLambda);
		System.out.println(sumRedu);

		// find any
		Optional<Integer> findAny = num.stream().findAny();
		System.out.println(findAny.get());

		// extract firsnames

		List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
		String first = fullNames.stream().findFirst().get();

		List<String> firstname = fullNames.stream().map(n -> n.split(" ")[0]).toList();
		System.out.println(firstname);

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> startWith1 = myList.stream().filter(n -> String.valueOf(n).startsWith("1")).toList();
		System.out.println(startWith1);

		List<String> nj = Arrays.asList("1", "56", "89", "10");

		List<String> x = nj.stream().filter(n -> n.startsWith("1")).toList();

		System.out.println(x);

		String nam = "Java articles are Awesome";

		char[] chr = nam.toCharArray();
		System.out.println(chr);

		List<Integer> sdivbk = Arrays.asList(10, 15, 8, 49, 15, 98, 49);

		List<Integer> nss = sdivbk.stream().filter(n -> Collections.frequency(sdivbk, n) == 1).toList();
		System.out.println("lydycu" + nss);

		List<Integer> ssds = sdivbk.stream().distinct().toList();
		System.out.println("eshsrh" + ssds);

		String input = "Java Articles are Awesome";

		List<Character> chr1 = input.chars().mapToObj(c -> (char) c).toList();
		System.out.println("chr1" + chr1);

		Optional<Character> hd = chr1.stream().filter(n -> Collections.frequency(chr1, n) > 1).findFirst();

		System.out.println(hd);

	}

}
