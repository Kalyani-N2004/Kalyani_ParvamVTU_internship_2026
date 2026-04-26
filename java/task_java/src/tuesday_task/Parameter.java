package tuesday_task;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        System.out.println("Employee Constructor");
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Parameter{
    public static void main(String[] args) {
        Employee e = new Employee("Arjun", 55000);
        e.display();
    }
}
