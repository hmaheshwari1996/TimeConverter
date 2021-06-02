/**
 * Time Converter
 *      You need a program to convert days to seconds.
 *      The given code takes the amount of days as input, convert it to seconds and output the result.
 * 
 * Sample Input: 12
 * Expected Output: 1036800
 * 
 * Explanation:
 *      12 days are 12*24 = 288 hours, which are 288*60 = 17280 minutes, which are 17280*60 = 1036800 seconds.
 */

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

		//Scanner Class Object
		Scanner scanner = new Scanner(System.in);
		//Variable to store user input for number of days
		int days = scanner.nextInt();
		
		//Data manipulation and storing result
		int result = days * 24 * 60 * 60;
		
		//Display Result
		System.out.println("Number of Seconds in " + days + "days are: " +result);
		
	}

}
