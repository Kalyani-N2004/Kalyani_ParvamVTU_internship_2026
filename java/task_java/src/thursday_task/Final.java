package thursday_task;

final class FinalClass { // final class (cannot be inherited)
    void show() {
        System.out.println("This is a final class method");
    }
}

class Parent {
    final void display() { // final method (cannot be overridden)
        System.out.println("This is a final method in Parent class");
    }
}

class Child extends Parent {
    // Cannot override display() because it is final
}

class Demo {
    final int x = 10; // final variable

    void show() {
        System.out.println("Final variable x = " + x);
    }
}

class Test {
    int value = 100;
}

public class Final {
    public static void main(String[] args) {

        // 🔹 Final Variable
        Demo d = new Demo();
        d.show();
        // d.x = 20; not allowed

        // 🔹 Final Method
        Child c = new Child();
        c.display();

        // 🔹 Final Class
        FinalClass fc = new FinalClass();
        fc.show();

        // 🔹 Final Reference Variable
        final Test t = new Test();
        System.out.println("Before change: " + t.value);

        t.value = 200; // ✅ allowed (changing object data)
        System.out.println("After change: " + t.value);

        // t = new Test();  not allowed (cannot change reference)
    }
}