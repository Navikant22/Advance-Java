class Test {
    int value;

    Test() {
        this(10);
        System.out.println("Default constructor");
    }

    Test(int x) {
        this(x, 20);
        System.out.println("One parameter: " + x);
    }

    Test(int x, int y) {
        value = x + y;
        System.out.println("Two parameters: " + x + ", " + y);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Value: " + t.value);
    }
}

// ==============OUTPUT====================>
/*Two parameters: 10, 20
One parameter: 10
Default constructor
Value: 30*/
