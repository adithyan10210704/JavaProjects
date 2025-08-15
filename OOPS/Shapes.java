package OOPS;
//Java program to create a class called shape and create some other classes like rectangle, triangle, circle and find the area for each class, and create objects for each classes inside the shape class. Print area for each class.
public class Shapes {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        System.out.println("Area of Rectangle: "+ rectangle.areaOfRectangle(40,100));
        System.out.println("Area of Triangle: "+ triangle.areaOfTriangle(10,15));
        System.out.println("Area of Circle: "+circle.areaOfCircle(6));
    }
}
class Rectangle{
    int length;
    int breadth;
    double areaOfRectangle(int l,int b){
        length=l;
        breadth=b;
        return length * breadth;
    }
}
class Triangle{
    int breadth;
    int height;
    double areaOfTriangle(int b,int h){
        breadth=b;
        height=h;
        return 0.5 * breadth * height;
    }
}
class Circle{
    int radius;
    double areaOfCircle(int r){
        radius = r;
        return Math.PI * Math.pow(radius,2);
    }
}
