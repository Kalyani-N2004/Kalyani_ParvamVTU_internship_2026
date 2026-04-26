package wednesday_java;
class Engineer {
    void work() {
        System.out.println("Engineer is working...");
    }
}

class SoftwareEngineer extends Engineer {
    void code() {
        System.out.println("Writing code...");
    }
}

class CivilEngineer extends Engineer {
    void build() {
        System.out.println("Constructing buildings...");
    }
}

public class Heirarchical {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        se.work();
        se.code();

        CivilEngineer ce = new CivilEngineer();
        ce.work();
        ce.build();
    }
}

