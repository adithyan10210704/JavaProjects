package OOPS;

/*
    Write a program to create a class named Shape. It should contain 2 methods, draw() and erase()
    that print "Drawing Shape" and "Erasing Shape" respectively.
    For this class, create three subclasses - Circle, Triangle, and Square.
    Each class should override the parent class functions - draw() and erase().
 */

public class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing Circle");
        }

        @Override
        public void erase() {
            System.out.println("Erasing Circle");
        }
    }

    static class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing Triangle");
        }

        @Override
        public void erase() {
            System.out.println("Erasing Triangle");
        }
    }

    static class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing Square");
        }

        @Override
        public void erase() {
            System.out.println("Erasing Square");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}