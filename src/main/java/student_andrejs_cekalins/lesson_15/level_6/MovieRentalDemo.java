package student_andrejs_cekalins.lesson_15.level_6;

public class MovieRentalDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Andrejs");
        Customer customer2 = new Customer("Dmitry");
        Movie regular = new Movie("Rambo", MovieCategory.REGULAR);
        Movie children = new Movie("Pinocchio", MovieCategory.CHILDREN);
        Movie newRelease = new Movie("Dumbo", MovieCategory.NEW_RELEASE);
        Rental rental1 = new Rental(regular, 3);
        Rental rental2 = new Rental(children, 10);
        Rental rental3= new Rental(newRelease,11);
        customer1.addRental(rental1);
        customer2.addRental(rental2);
        customer2.addRental(rental1);
        customer2.addRental(rental3);
        System.out.println(customer1.statement());
        System.out.println(customer2.statement());
    }
}
