package Chapter4;
/**
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, 
 * North Carolina from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. (Hint: Use the formula in Programming 
 * Exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 * Atlanta-Georgia:40.757123775433385,-73.98504495620728
 * Orlando, Florida:28.5383355,-81.37923649999999
 * Savannah, Georgia:32.0835407,-81.09983419999998
 * Charlotte, North Carolina:35.2270869,-80.84312669999997
 * 
 * radius = 6371.01km
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * s = (side1 + side2 + side3)/2;
 * area = sqrt(2s(s - side1)(s - side2)(s - side3))
 * @author guyiting
 *
 */

public class practice4_3 {

	public static void main(String[] args) {
		double d1, d2,d3,d4,d5,s1,s2,area1,area2;
		double x1 = 40.757123775433385,y1 = -73.98504495620728;
		double x2 = 28.5383355, y2 = -81.37923649999999;
		double x3 = 32.0835407,y3 = -81.09983419999998;
		double x4 = 35.2270869,y4 = -80.84312669999997;
			
	
	d1 = distance(x1,y1,x2,y2);
	d2 = distance(x2,y2,x3,y3);
	d3 = distance(x3,y3,x4,y4);
	d4 = distance(x4,y4,x1,y1);
	d5 = distance(x1,y1,x3,y3);
	//System.out.printf("%-6.2f\n%-6.2f\n%-6.2f\n%-6.2f",d1, d2,d3,d4);
	s1 = (d1 + d2 + d5)/2;
	s2 = (d3 + d4 + d5)/2;
	//area = sqrt(2s(s - side1)(s - side2)(s - side3))
    area1 = area(s1,d1,d2,d3);
	area2 = area(s2,d3,d4,d5);
	
	System.out.println("The estimated area enclosed by these four cities:"+(area1+area2));
	}

	public static double area(double s1,double d1,double d2,double d3) {
		double area =Math.sqrt(2 * s1 *(s1 - d1)*(s1 - d2)*(s1 - d3));
		return area;
		
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double radius = 6371.01;
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		return d;
	}

}
