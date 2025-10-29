package examples;

public class CountOccurrencesInArray {

	public static void main(String[] args) {
		CountOccurrencesInArray obj = new CountOccurrencesInArray();

		int[] input = { 25, 4, 26, 89, 4, 26, 4, 26, 26 };
		String result = obj.countOccurrences(input, 26);
		System.out.println(result);

		String result1 = obj.findMostFrequent(input);
		System.out.println(result1);

	}

	public String findMostFrequent(int[] input) {

		int mostFreq = input[0];
		int maxCount = 0;
		for (int i = 0; i < input.length; i++) {

			int count = 0;
			for (int j = 0; j < input.length; j++) {

				if (input[i] == input[j]) {
					count++;
				}

			}
			if (count > maxCount) {
				mostFreq = input[i];
				maxCount = count;
			}
		}

		return "Most frequent number in an array is : " + mostFreq + " with " + maxCount + " times.";
	}

	public String countOccurrences(int[] input, int target) {

		// Count how many times a given number appears in the array.
		int count = 0;

		for (int num : input) {
			if (num == target) {
				count++;

			}

		}

		return "Input number " + target + " is present " + count + " times in an array";
	}

}
