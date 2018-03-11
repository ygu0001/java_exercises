package Chapter10;

/**
 (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
■ Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods. MyPoint is defined in Programming Exercise 10.4.
■ A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
■ A constructor that creates a triangle with the specified points.
■ A method getArea() that returns the area of the triangle.
■ A method getPerimeter() that returns the perimeter of the triangle.
■ A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle (see Figure 10.22a).
■A method contains(Triangle2D t) that returns true if the specified triangle is inside this triangle (see Figure 10.22b).
■A method overlaps(Triangle2D t) that returns true if the specified triangle overlaps with this triangle (see Figure 10.22c).
 --------------------------------------------------------------------------
 Draw the UML diagram for the class and then implement the class.
 ■Write a test program that creates a Triangle2D objects t1 using the constructor new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), 
 new MyPoint(5, 3.5)), displays its area and perimeter, and displays the result of t1.contains(3, 3), r1.contains(new Triangle2D(new MyPoint(2.9, 2), 
 new MyPoint(4, 1), MyPoint(1, 3.4))), and t1. overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))).
(Hint: For the formula to compute the area of a triangle, see Programming Exer- cise 2.19. To detect whether a point is inside a triangle, draw three dashed lines,
 as shown in Figure 10.23. If the point is inside a triangle, each dashed line should intersect a side only once. If a dashed line intersects a side twice, 
 then the point must be outside the triangle. For the algorithm of finding the intersect- ing point of two lines, see Programming Exercise 3.25.)
 *
 */
public class Triangle2D {
	/**Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods. MyPoint is defined in Programming Exercise 10.4.*/
	private MyPoint p1,p2,p3;
	/**■ A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).*/	
	public Triangle2D() {
	p1 = new MyPoint(0,0);
	p2 = new MyPoint(1,1);
	p3 = new MyPoint(2,2);
	}
	/**	■ A constructor that creates a triangle with the specified points.*/		
	public Triangle2D(double x1,double y1, double x2,double y2, double x3,double y3) {
	this.p1 = new MyPoint(x1,y1);
	this.p2 = new MyPoint(x2,y2);
	this.p3 = new MyPoint(x3,y3);		
	}
	
	/**p1, p2, and p3 of the type MyPoint with getter and setter methods. */	
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	/**■ A method getArea() that returns the area of the triangle.*/
	public double getArea() {
		double a = p1.distance(p2);
		double b = p2.distance(p3);
		double c = p3.distance(p3);
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}	
	/**■ A method getPerimeter() that returns the perimeter of the triangle.*/
	public double getPerimeter() {
		return p1.distance(p2)+p2.distance(p3)+ p3.distance(p1);
	}
	/** ■ A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle (see Figure 10.22a).*/
	
	
	/**■A method contains(Triangle2D t) that returns true if the specified 
	 triangle is inside this triangle (see Figure 10.22b).*/
	
	
	
	/**■A method overlaps(Triangle2D t) that returns true if the specified 
	 triangle overlaps with this triangle (see Figure 10.22c).*/
	
	
public static void main(String[] args) {	
	/** creates a Triangle2D objects t1 using the constructor new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), 
 new MyPoint(5, 3.5)), displays its area and perimeter, and displays the result of t1.contains(3, 3), r1.contains(new Triangle2D(new MyPoint(2.9, 2), 
 new MyPoint(4, 1), MyPoint(1, 3.4))), and t1. overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))).*/
}

}
