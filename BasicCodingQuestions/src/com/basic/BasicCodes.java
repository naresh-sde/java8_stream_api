package com.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicCodes {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 3);

		Set<Integer> dp = new HashSet<>();

		List<Integer> nl = nums.stream().filter(n -> !dp.add(n)).distinct().toList();
		System.out.println("jjhbkb--" + nl);
		System.out.println(nums.stream().distinct().toList());

		System.out.println(nums.stream().filter(n -> Collections.frequency(nums, n) > 1).distinct().toList());

		System.out.println("max---" + nums.stream().max(Integer::compare).get());

		System.out.println("min---" + nums.stream().min(Integer::compare).get());

		System.out.println("min---" + nums.stream().mapToInt(Integer::intValue).min().getAsInt());
		System.out.println("max---" + nums.stream().max((a, s) -> a - s).get());

		System.out.println("min---" + Collections.min(nums));

		System.out.println("rev--" + nums.stream().sorted(Comparator.reverseOrder()).toList());

		Map<Integer, String> input = new HashMap<>();

		input.put(1, "Naresh");
		input.put(2, "Nagula");
		input.put(4, "yAdav");
		input.put(3, "nari");

		List<String> up = input.values().stream().map(String::toUpperCase).toList();
		System.out.println("jfbhbdk--" + up);

		Map<Integer, String> ups = input.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toUpperCase()));
		System.out.println("jfbhbdk--" + ups);

		// find a keys greater than 2

		System.out.println("dvbkhdbv--" + input.entrySet().stream().filter(n -> n.getKey() > 2)
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toLowerCase())));

		System.out.println("hsdvhs--" + input.values().stream().filter(n -> n.startsWith("N")).count());

		System.out.println("sortedMap " + input.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue())));

		Map<Integer, String> sortedMap = new TreeMap<>(input);
		System.out.println("sortedMap " + sortedMap);

		String name = "Jai hanuman Jai Sriram";

		List<Character> listOfCh = name.chars().mapToObj(c -> Character.toLowerCase((char) c)).filter(j -> j != ' ')
				.toList();
		System.out.println("----" + listOfCh);
		Stream<Character> frst = listOfCh.stream().filter(n -> (Collections.frequency(listOfCh, n) == 1));

//		System.out.println("findFirst---" + frst.findFirst().get());

		System.out.println("second----" + frst.findFirst().get());

		List<Integer> ahvah = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 1);

		System.out.println("khadvhsdkhv----" + ahvah.stream().max(Integer::compare).get());

		System.out.println("khadvhsdkhv----" + ahvah.stream().mapToInt(Integer::intValue).max().getAsInt());
		System.out.println("khadvhsdkhv----" + ahvah.stream().min(Integer::compare).get());
		System.out.println("khadvhsdkhv----"
				+ ahvah.stream().filter(n -> (Collections.frequency(ahvah, n) == 1)).distinct().count());

		Set<Integer> dpsc = new HashSet<>();
		System.out.println("khadvhsdkhv----" + ahvah.stream().filter(n -> !dpsc.add(n)).distinct().count());

		List<Integer> kdvbsjbv = ahvah.stream().distinct().toList();

		System.out.println("jjsds---" + kdvbsjbv);
		Set<Integer> hbk = new LinkedHashSet<>(kdvbsjbv);

		System.out.println("kjsbv---" + hbk);

		List<String> namessss = Arrays.asList("Naesh", "Nagula", "yadav", "nari");

		List<String> isbvbsk = namessss.stream().filter(n -> n.startsWith("N")).toList();
		System.out.println("dkkk--" + isbvbsk);

		List<String> kdhbs = namessss.stream().filter(n -> n.toUpperCase().startsWith("N")).toList();
		System.out.println("dkkk--" + kdhbs);

		Map<Object, Integer> bdsk = namessss.stream().collect(Collectors.toMap(namne -> namne, String::length));
		System.out.println("dbds--" + bdsk);

		Map<Object, Integer> sidvbk = namessss.stream()
				.collect(Collectors.toMap(c -> c, String::length, (a, b) -> a, LinkedHashMap::new));
		System.out.println("dbds--" + sidvbk);

		List<String> names = Arrays.asList("Alice", "adam", "Bob", "Brian", "Charlie", "Cathy");

		Map<Character, List<String>> grouped = names.stream()
				.collect(Collectors.groupingBy(ss -> Character.toUpperCase(ss.charAt(0))));

		System.out.println(grouped);
		System.out.println("uhvbjh--" + names.stream().toList());

		// case sensitive
		Map<Character, List<String>> grouped1 = names.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));

		System.out.println("grouped1---" + grouped1);

		Map<Character, Long> countByLetter = names.stream()
				.collect(Collectors.groupingBy(n -> Character.toUpperCase(n.charAt(0)), Collectors.counting()));

		System.out.println("countByLetter---" + countByLetter);
		String result = names.stream().collect(Collectors.joining(", "));
		System.out.println("shbbvj--" + result);

		List<Integer> kkvbkdbf = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 8);

		Map<Boolean, List<Integer>> partitioned = kkvbkdbf.stream().distinct()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println("Even numbers: " + partitioned.get(true));
		System.out.println("Odd numbers: " + partitioned.get(false));
		int sum = kkvbkdbf.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("dvjsb---" + sum);

		int sum2 = names.stream().collect(Collectors.summingInt(String::length));
		System.out.println("dvjsb---" + sum2);

		double avg = names.stream().collect(Collectors.averagingInt(String::length));

		System.out.println("kdgksd" + avg);

		Optional<String> longest = names.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
		System.out.println("shvbb--" + longest.get());

		Map<Character, List<Integer>> lengthsByLetter = names.stream().collect(
				Collectors.groupingBy(n -> n.charAt(0), Collectors.mapping(String::length, Collectors.toList())));

		System.out.println("ddjbj---" + lengthsByLetter);
		int totalLength = names.stream().collect(Collectors.reducing(0, String::length, Integer::sum));

		System.out.println("kavk---" + totalLength);

		List<String> nk = names.stream().sorted(Comparator.comparing(String::toString).thenComparingInt(String::length)).toList();
		System.out.println("jdfbk---" + nk);

		
		

		
		
		 
		 List<String> countries=Arrays.asList("India","Japan","america","pandichery");
		 
		
		
		 
		 countries.stream().filter(n -> n.toLowerCase().contains("p")).forEach(System.out::println);
		 
		 int[] numsa= {1,2,5,9,7,5,6,6};
		 
		 Arrays.stream(numsa).distinct();
		 
		 Set<Integer> set=new HashSet<>();
		 Set<Integer>dup=new HashSet<>();
		 for(int xd:nums) {
			if(!set.add(xd)) {
				dup.add(xd);
			}
		 }
		 System.out.println("bdbkjd"+dup);
		 
		 System.out.println(set);
		 
		 List<Integer> list = Arrays.stream(numsa).boxed().toList();

		 List<Integer> duplicates = list.stream()
		         .filter(n -> Collections.frequency(list, n) > 1)
		         .distinct()
		         .toList();
		 System.out.println("duplicates---"+duplicates);
		 int n=136;
		 
		 int sums=0;
		 //136 / 10
		 
		 while(n>0) {
			 sums+=n%10;
			 n/=10;
		 }
		 System.out.println("sum---"+sums);
		 
		 String c="Java";
		 
		StringBuilder x= new StringBuilder(c).reverse();
		System.out.println(x);
		
		String rev="";
		for(int i=c.length()-1;i>=0;i--) {
			
			rev+=c.charAt(i);
			
		}
		 System.out.println("rev---"+rev);
		 
	}

}
