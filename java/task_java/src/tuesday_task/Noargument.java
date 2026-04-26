package tuesday_task;
class Student {
    String name;
    int age;

    // No-arg constructor
    Student() {
        System.out.println("Student Created");
    }
}
    public class Noargument {

    
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Kalyani";
        s.age = 20;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}


