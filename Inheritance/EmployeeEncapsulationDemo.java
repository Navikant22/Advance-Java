class Employee {

    // Private fields
    private int id;
    private String name;
    private double salary;

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for salary (with validation)
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

public class EmployeeEncapsulationDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Navi");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        // Testing validation
        emp.setSalary(-1000); // invalid
    }
}
