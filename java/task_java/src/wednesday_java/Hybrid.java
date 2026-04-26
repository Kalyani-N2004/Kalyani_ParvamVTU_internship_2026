package wednesday_java;
interface CollegeRules {
    void followRules();
}

class Student implements CollegeRules {
    public void followRules() {
        System.out.println("Student follows college rules...");
    }
}

interface Sports {
    void playSport();
}

class EngineeringStudent extends Student implements Sports {
    public void playSport() {
        System.out.println("Engineering student plays sports...");
    }
}

public class Hybrid{
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.followRules();   // from CollegeRules (via Student)
        es.playSport();     // from Sports
    }
}