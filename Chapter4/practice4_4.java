package Chapter4;

import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side):
VideoNote
Compute great circle distance
Write a program that prompts the user to enter the side of a hexagon and displays its area. Here is a sample run:
 */

public class practice4_4 {

	public static void main(String[] args) {
		double s, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		s = sc.nextDouble();
		area = 6 * s * s /(4 * Math.tan(Math.PI/6));
		System.out.printf("The area of the hexagon is %.2f",area);
	}

}
