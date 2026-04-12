class Student {
    String name;
    int age;
}

public class ReferenceDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";

        Student s2 = s1;   // same reference

        s2.name = "Bob";

        System.out.println(s1.name);
    }
}
