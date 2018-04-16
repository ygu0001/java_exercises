public class listing9_1 {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println(circle.getArea());
    }
}


class Circle {
    double radius = 1;
    Circle(){

    }

    Circle(double newRadius){
        this.radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }
}