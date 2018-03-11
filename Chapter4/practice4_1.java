package Chapter4;

import java.util.Scanner;

/**
 * 4.1
(Geometry: area of a pentagon) 
Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon, 
as shown in the following figure.
 * @author guyiting
 *
 */

public class practice4_1 {

	public static void main(String[] args) {
		double r,s,area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex:");
		r = sc.nextDouble();
		s = 2 * r * Math.sin(Math.PI/5);
		area = 5 * Math.pow(s, 2)/(4 * Math.tan(Math.PI/5));
		System.out.printf("The area of the pentagon is %.2f",area);
	}

}
