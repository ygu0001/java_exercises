package Chapter4;

import java.util.Scanner;

/*
 * (Geometry: great circle distance) The great circle distance is the distance between two points on the surface of a sphere. 
 * Let (x1, y1) and (x2, y2) be the geographi- cal latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:
 */

public class practice4_2 {

	public static void main(String[] args) {
		double x1, y1, x2,y2,distance;
		double radius = 6371.01;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		x1 = Math.toRadians(sc.nextDouble());
		y1 = Math.toRadians(sc.nextDouble());
				
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		x2 = Math.toRadians(sc.nextDouble());
		y2 = Math.toRadians(sc.nextDouble());
		
		distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		
		System.out.println("The distance between the two points is: "+ distance +" km");
		
	}

}
