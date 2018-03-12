package Chapter4;

import java.util.Scanner;

/**
 * (Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:
 * @author guyiting
 *
 */
public class practice4_9 {

	public static void main(String[] args) {
		char ch;
		
		System.out.println("Enter a character:");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		System.out.println("The Unicode for the character "+ch +" is "+(int)ch);

	}

}
