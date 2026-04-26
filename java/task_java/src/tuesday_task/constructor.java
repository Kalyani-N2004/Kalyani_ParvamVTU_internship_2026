package tuesday_task;

class Person {
    String name;
    int age;
    String email;

    Person() {
        System.out.println("No-Arg Constructor");
        name = "Unknown";
        age = 0;
        
    }

    Person(String name, int age) {
        System.out.println("2-Arg Constructor");
        this.name = name;
        this.age = age;
        
    }

    Person(String name, int age, String email) {
        System.out.println("3-Arg Constructor");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void display() {
        System.out.println("Name:" + name );
        System.out.println("Age:" + age ); 
        System.out.println("Email:" + email);
    }
}

public class constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person("Meera", 22);
        p2.display();

        Person p3 = new Person("Karan", 25, "karan@email.com");
        p3.display();
    }
}