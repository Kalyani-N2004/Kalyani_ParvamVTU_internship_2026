package thursday_task;

class Student {
    int id;
    String name;
    static String college = "ABC College"; // static variable

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kalyani");
        Student s2 = new Student(2, "Ravi");

        s1.display();
        s2.display();
    }
}