class Rectangle {
    int length;
    int width;

    // Default constructor
    Rectangle() {
        length = 0;
        width = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
        System.out.println("Parameterized constructor called");
    }

    // Copy constructor
    Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
        System.out.println("Copy constructor called");
    }

    // Method to calculate area
    int area() {
        return length * width;
    }
}

public class RectangleConstructorDemo {
    public static void main(String[] args) {

        // Default constructor
        Rectangle r1 = new Rectangle();

        // Parameterized constructor
        Rectangle r2 = new Rectangle(10, 5);

        // Copy constructor
        Rectangle r3 = new Rectangle(r2);

        // Output
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Area of r2: " + r2.area());
        System.out.println("Area of r3: " + r3.area());
    }
}
