 // Given code (Wrong)====================>
class Parent {
    final int VALUE = 100;

    final void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        VALUE = 200;
        System.out.println("Child");
    }
}

<=============== CURRECT VERSION ===============>
class Parent {
    final int VALUE = 100;

    final void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void show() {   // renamed method (no overriding)
        // VALUE = 200; //not allowed
        System.out.println("Child method");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();

        c.display();  // Parent method
        c.show();     // Child method
    }
}
