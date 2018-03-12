package Chapter4;

import java.util.Scanner;

/**
*(Convert letter grade to number) Write a program that prompts the user to enter a letter grade A, B, C, D, or F and 
*displays its corresponding numeric value 4, 3, 2, 1, or 0. Here is a sample run:
*@author Clair Yiting Gu
*github:https://github.com/ygu0001/java_exercises/tree/master/Chapter4
*/
public class practice4_14 {

	public static void main(String[] args) {
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter grade:" );
		grade = sc.next().charAt(0);
		
		String result = "" ;
		
		switch(grade) {
		
		case 'A': result = "4";break;
		case 'B': result = "3";break;
		case 'C': result = "2";break;
		case 'D': result = "1";break;
		case 'E': result = "0";break;
		default : System.out.println(grade + " is an invalid input");System.exit(1);
		}
		System.out.println("The numeric value for grade " + grade + " is " + result );
		
		
		
		}
		
		
		
	}


