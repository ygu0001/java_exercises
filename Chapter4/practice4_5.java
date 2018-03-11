package Chapter4;

import java.util.Scanner;

/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 *  The formula for computing the area of a regular polygon is
 *  Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area. Here is a sample run:
 */
public class practice4_5 {

	public static void main(String[] args) {
		double s,n,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		n = sc.nextDouble();
		System.out.println("Enter the side:");
		s = sc.nextDouble();
		area = n * s * s /(4 * Math.tan(Math.PI/n));
		System.out.printf("The area of the polygon is %f",area);
	}

}
