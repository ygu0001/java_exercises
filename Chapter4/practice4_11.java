package Chapter4;

import java.util.Scanner;

/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number. 
 * Here are some sample runs:
 * @author guyiting
 *
 */

public class practice4_11 {

	public static void main(String[] args) {
		int hexNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		hexNumber  = sc.nextInt();
		
		if(hexNumber >= 10 && hexNumber <= 15) {
			char hexLetter = (char)(hexNumber + 55);
			System.out.println("The hex value is " + hexLetter);
		}
		else if( 0 <= hexNumber  && hexNumber < 10)
			System.out.println("The hex value is " + hexNumber);
		
		else
			System.out.println(hexNumber +" is an invalid input");
	}

}
