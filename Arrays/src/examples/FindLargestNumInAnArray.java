package examples;

import java.util.Scanner;

public class FindLargestNumInAnArray {

	public static void main(String[] args) {

		//Write a program to find the largest number in an array.
		
		FindLargestNumInAnArray obj = new FindLargestNumInAnArray();
		int largestnum = obj.directArrayDec();
		System.out.println("Largest number: " + largestnum);
		int largestnum1 = obj.takeArrayFromUser();
		System.out.println("Largest number: " + largestnum1);
	}

	public int directArrayDec() {

		int[] input = { 4, 9, 502000000, 36, 99 };

		int max = input[0];
		for (int num : input) {

			if (num > max) {
				max = num;

			}
		}

		return max;
	}

	public int takeArrayFromUser() {

		Scanner scanner = new Scanner(System.in);
		 
		// Ask for array size
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] input = new int[n];

		int max = input[0];

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}
		for (int num : input) {

			if (num > max) {
				max = num;

			}
		}
		scanner.close();

		return max;

	}

}
