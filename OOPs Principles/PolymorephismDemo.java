class Shape {
    void calculateArea() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    void calculateArea() {
        double radius = 5;
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void calculateArea() {
        int length = 10, width = 5;
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.calculateArea();

        s = new Rectangle();
        s.calculateArea();
    }
}
