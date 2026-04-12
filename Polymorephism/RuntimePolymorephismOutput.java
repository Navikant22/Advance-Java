class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class RuntimePolymorphismOutput {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
