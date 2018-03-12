package Chapter4;

import java.util.Scanner;

/**
*(Phone key pads) The international standard letter/number mapping found on the telephone is shown below:
*Write a program that prompts the user to enter a letter and displays its correspond- ing number.
*@author Clair Yiting Gu
*github:https://github.com/ygu0001/java_exercises/tree/master/Chapter4
*/
public class practice4_15 {

	public static void main(String[] args) {
		
		char letter;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		letter = Character.toUpperCase(sc.next().charAt(0));
		
		if(Character.isLetter(letter)) {
			num = (letter - 'A')/3+2;
		System.out.println("The corresponding number is " + num);}
		else if (80 <= letter && letter <= 83 ) {
			num = 7;
			System.out.println("The corresponding number is " + num);}
		else if (87 <= letter && letter <= 90) {
			num = 9;
			System.out.println("The corresponding number is " + num);}
		else
			System.out.println(letter + " is an invalid input.");
			
		
		
		
	}

}
