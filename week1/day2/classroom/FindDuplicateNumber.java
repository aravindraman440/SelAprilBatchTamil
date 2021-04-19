package week1.day2.classroom;

import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int[] input = {23, 36, 23, 45, 67, 26, 45, 41, 36};
		//method 1
		/*
		 * for (int i = 0; i < input.length; i++) { for (int j = i+1; j < input.length;
		 * j++) { if(input[i]==input[j])
		 * System.out.println("duplicate num is:"+input[i]);
		 * 
		 * } }
		 */	

		//method 2
		Arrays.sort(input);
		for (int i = 0; i < input.length -1; i++) {
			if(input[i]==input[i+1])
				System.out.println("the duplicate no is:"+input[i]);
		}
	}


}
