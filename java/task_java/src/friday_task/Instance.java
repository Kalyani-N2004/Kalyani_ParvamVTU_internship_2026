package friday_task;

class Student {
    String name;
    int rollNumber;
    
    // Instance block
    {
        System.out.println("Instance block executed: Assigning default values");
        name = "Unknown";
        rollNumber = 0;
    }
    
    // Constructor
    Student(String n, int r) {
        name = n;
        rollNumber = r;
        System.out.println("Constructor executed: Student object created");
    }
    
    void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}

public class Instance {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        s1.display();
        
        System.out.println("--- Creating another student ---");
        
        Student s2 = new Student("Bob", 102);
        s2.display();
    }
}