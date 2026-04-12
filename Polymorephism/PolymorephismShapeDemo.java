class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

public class PolymorphismShapeDemo {
    public static void main(String[] args) {

        Shape s;

        // Runtime polymorphism
        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }
}
