package student_andrejs_cekalins.lesson_15.level_6;

import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector ();

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
