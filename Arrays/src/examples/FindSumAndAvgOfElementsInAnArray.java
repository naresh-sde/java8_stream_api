package examples;

public class FindSumAndAvgOfElementsInAnArray {
	
	
	public static void main(String[] args) {
		
		//Find the sum and average of elements in an array.
		
		int[] input= {51,23,21,38,32,70};
		
		int sum=0;
		
		for(int num:input) {
			sum+=num;
			
		}
		
		double avg=(double)sum/input.length;
		System.out.println("Sum of elements present in array is : " +sum);
		System.out.println("Avg of elements present in array is : " +avg);
	}

}
  