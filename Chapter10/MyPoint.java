package Chapter10;
/**10.4 (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
■ The data fields x and y that represent the coordinates with getter methods.
■ A no-arg constructor that creates a point (0, 0).
■ A constructor that constructs a point with specified coordinates.
■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. 
Write a test program that creates the two points (0, 0) and (10, 30.5) 
and displays the distance between them.
*/

public class MyPoint {
/**The data fields x and y that represent the coordinates with getter methods.*/
private double x;
private double y;

/**■ A no-arg constructor that creates a point (0, 0).*/
public MyPoint() {
	this(0,0);
}
/**■ A constructor that constructs a point with specified coordinates.*/
public MyPoint(double x,double y) {
	this.x = x;
	this.y = y;
}
/**■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.*/
public double distance(MyPoint specifiedPoint) {
	return distance(this,specifiedPoint);	
}

/**■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.*/
public static double distance(MyPoint p1,MyPoint p2) {
	return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
}//为什么这里要加static

public static void main(String[] args) {
	MyPoint p1 = new MyPoint();
	MyPoint p2 = new MyPoint(10,30.5);
	System.out.println(p2.distance(p2));//
	System.out.println(MyPoint.distance(p1,p2));//
}
}
