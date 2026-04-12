class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();

        Motorcycle m = new Motorcycle();
        m.start();
        m.ride();
    }
}
