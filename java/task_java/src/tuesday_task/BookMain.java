package tuesday_task;

class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book() {
        System.out.println("No-Arg Constructor");
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        available = true;
    }

    Book(String title, String author) {
        System.out.println("2-Arg Constructor");
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.available = true;
    }

    Book(String title, String author, double price, boolean available) {
        System.out.println("4-Arg Constructor");
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void showInfo() {
        System.out.println("Title: " + title); 
         System.out.println("Price: " + price);
         System.out.println("Available: " + available);
                
    }

    void issueBook() {
        available = false;
        System.out.println(title + " issued.");
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "Unknown");
        Book b3 = new Book("Clean Code", "R. Martin", 499.0, true);

        b1.showInfo();
        b2.showInfo();

        b3.issueBook();
        b3.showInfo();
    }
}