package Chapter4;

import java.util.Scanner;

/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character. 
 * Here is a sample run:
 */
public class practice4_8 {

	public static void main(String[] args) {
		int code;
		
		System.out.println("Enter an ASCII code:");
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		System.out.println("The character for ASCII code "+code +" is "+(char)code);
	}

}
