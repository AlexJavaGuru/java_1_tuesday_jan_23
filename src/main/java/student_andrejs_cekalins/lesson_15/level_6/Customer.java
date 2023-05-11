package student_andrejs_cekalins.lesson_15.level_6;


import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String name;
    private double totalAmount;
    private int frequentRenterPoints;
    private List<Rental> rentals;
    private String result;

    public Customer(String name) {
        this.name = name;
        this.totalAmount = 0;
        this.frequentRenterPoints = 0;
        this.rentals = new ArrayList<>();
        this.result = "Rental Record for: " + getName() + "\n";
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        double amount = 0;
        for (Rental rental : rentals) {
            switch (rental.getMovie().getCategory()) {
                case REGULAR -> amount = regularAmount(rental);
                case NEW_RELEASE -> amount = newReleaseAmount(rental);
                case CHILDREN -> amount = childrenAmount(rental);
            }
            frequentRenterPointsCalculation(rental);
            movieTitleAndAmountVisualisation(amount, rental);
        }
        totalAmountAndFrequentRenterPointsVisualisation();
        return result;
    }

    private void totalAmountAndFrequentRenterPointsVisualisation() {
        result += "You owed " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
    }

    private void movieTitleAndAmountVisualisation(double amount, Rental rental) {
        result += "\t" + rental.getMovie().getTitle() + "\t"
                + String.valueOf(amount) + "\n";
        totalAmount += amount;
    }

    private void frequentRenterPointsCalculation(Rental rental) {
        frequentRenterPoints++;
        if (rental.getMovie().getCategory().equals(MovieCategory.NEW_RELEASE) && rental.getDaysRented() > 1)
            frequentRenterPoints++;
    }

    private double regularAmount(Rental rental) {
        double amount = 2;
        if (rental.getDaysRented() > 2) {
            amount += (rental.getDaysRented() - 2) * 1.5;
        }
        return amount;
    }

    private double newReleaseAmount(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    private double childrenAmount(Rental rental) {
        double amount = 1.5;
        if (rental.getDaysRented() > 3) {
            amount += (rental.getDaysRented() - 3) * 1.5;
        }
        return amount;
    }
}


