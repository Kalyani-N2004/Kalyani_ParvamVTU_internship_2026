package friday_task;

class Vehicle {
    static String companyName;
    
    // Static block
    static {
        companyName = "SpeedX Motors";
        System.out.println("Static block executed: Company Name initialized");
    }
    
    void showCompany() {
        System.out.println("Vehicle company: " + companyName);
    }
}

public class Static {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(); // Static block already executed before this line
        v1.showCompany();
        
        Vehicle v2 = new Vehicle(); // Static block does NOT run again
        v2.showCompany();
    }
}