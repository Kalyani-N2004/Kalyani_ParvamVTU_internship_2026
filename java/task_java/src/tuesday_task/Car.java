package tuesday_task;

class Car1 {
    String brand;
    double price;

    Car1(String brand, double price) {
        System.out.println("Car Constructor");
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand:" + brand );
        System.out.println("Price:" + price );
        
    }
}

public class Car {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Toyota", 800000);
        Car1 c2 = new Car1("Honda", 900000);
        Car1 c3 = new Car1("Hyundai", 700000);

        c1.display();
        c2.display();
        c3.display();
    }
}
