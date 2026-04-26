package friday_task;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        
        // Add students
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        
        // Access a student
        System.out.println("First student: " + students.get(0));
        
        // Check if a student exists (contains method)
        System.out.println("Is Bob present? " + students.contains("Bob"));
        System.out.println("Is David present? " + students.contains("David"));
        
        // Remove a student
        students.remove("Bob");
        
        // Check again after removal
        System.out.println("Is Bob present after removal? " + students.contains("Bob"));
        
        // Size of list
        System.out.println("Number of students: " + students.size());
        
        // Loop through students
        for (String s : students) {
            System.out.println(s);
        }
    }
}