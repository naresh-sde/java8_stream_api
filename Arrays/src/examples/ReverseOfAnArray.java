package examples;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class ReverseOfAnArray {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5 };

		ArrayList<Integer> rev = new ArrayList<>();
		System.out.println("fiai---" + input.length);

		for (int i = (input.length - 1); i >= 0; i--) {

			rev.add(input[i]);
		}
		ReverseOfAnArray obj = new ReverseOfAnArray();
		System.out.println("Reverse of an array : " + rev);
		System.out.println(obj.isPrime(8));
		System.out.println(obj.isPalindrom("MADAM"));
		obj.isFibonici(5);
		System.out.println();

//		Stream.generate(Math::random).limit(3).forEach(System.out::println);

//		if you integers

		Random rm = new Random();
		Stream.generate(() -> Math.abs(rm.nextInt())).limit(5).forEach(System.out::println);
		
		List<String> nums=List.of("1","2","3","4","5");
		
		
		
		List<Integer> nmkk=List.of(1,2,5,8,9,5,45);
		int sum=nmkk.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		double avg=nmkk.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("avg---"+avg);
		
		IntSummaryStatistics nm=nums.stream().mapToInt(Integer::parseInt)
		.summaryStatistics();
		System.out.println(nm);
		
		

	}

	// prime
	public boolean isPrime(int num) {

		if (num <= 1) {
			System.out.println("Is not a prime number");
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println(num + "--Is not a prime number");
				return false;
			}
		}
		return true;

	}

	// palindrom

	public boolean isPalindrom(Object num) {

		String in = String.valueOf(num);
		String rev = new StringBuilder(in).reverse().toString();
		if (in.equals(rev)) {
			return true;
		}

		return false;
	}
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	/*
	 * class Main { public static void main(String[] args) {
	 * System.out.println("Try programiz.pro");
	 * 
	 * List<string> fr=Arrays.asList("apple", "banana","mango");
	 * 
	 * List<String> lengthOf=fr.stream().filt
	 * 
	 * //employe db
	 * 
	 * findAllByEmpIdAndState
	 * 
	 * 
	 * /fet
	 * 
	 * 
	 * GetMapping(/end) public String getAlldetal(re){
	 * 
	 * ..db operation return "nam"; }
	 * 
	 * base+end { "empi":155,
	 * 
	 * }
	 * 
	 * 
	 * //customer name date value
	 * 
	 * 2025 hight valued customer
	 * 
	 * 
	 * 
	 * selct name from custetable where customervalue is max
	 * 
	 * 
	 * 
	 * private sta
	 * 
	 * 
	 * 
	 * } }
	 */
	// FIBONICCI

	public void isFibonici(int num) {

		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < num; i++) {
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}

	}
}
