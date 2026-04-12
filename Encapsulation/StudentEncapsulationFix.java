class Student {

    // Private fields
    private String name;
    private int marks;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for marks
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class StudentEncapsulationFix {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Navi");
        s.setMarks(85);
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Age: " + s.getAge());

        // Testing invalid data
        s.setMarks(150); // invalid
        s.setAge(-5);    //  invalid
    }
}
