package student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore;

// This file is the original program.  It has been left here so you can compare it with the refactored version.

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int frequentRenterPoints;
    private double totalPrice;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.frequentRenterPoints = 0;
        this.totalPrice = 0.0;
        this.rentals = new ArrayList<>();
    }

    public int getFrequentRentPoints() {
        return frequentRenterPoints;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        List<MoviePrice> priceList = getPriceListWithMovies();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        result.append(priceList);
        result.append("\nYou owed ").append(totalPrice).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points\n");
        return result.toString();
    }

    private List<MoviePrice> getPriceListWithMovies() {
        double currentPrice = 0;
        List<MoviePrice> priceList = new ArrayList<>();
        for (Rental rental : rentals) {
            switch (rental.getMovie().getCategory()) {
                case REGULAR -> currentPrice = calculateRegularAmount(rental);
                case NEW_RELEASE -> currentPrice = calculateNewReleaseAmount(rental);
                case CHILDRENS -> currentPrice = calculateChildrensAmount(rental);
            }
            updateFrequentRenterPoints(rental);
            priceList.add(new MoviePrice(rental.getMovie().getTitle(), currentPrice));
            totalPrice += currentPrice;
        }
        return priceList;
    }

    private double calculateRegularAmount(Rental rental) {
        double amount = 2;
        if (rental.getDaysRented() > 2) {
            amount += (rental.getDaysRented() - 2) * 1.5;
        }
        return amount;
    }

    private double calculateNewReleaseAmount(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    private double calculateChildrensAmount(Rental rental) {
        double amount = 1.5;
        if (rental.getDaysRented() > 3) {
            amount += (rental.getDaysRented() - 3) * 1.5;
        }
        return amount;
    }

    private void updateFrequentRenterPoints(Rental rental) {
        frequentRenterPoints++;
        if (rental.getMovie().getCategory().equals(Categories.NEW_RELEASE)
                && rental.getDaysRented() > 1)
            frequentRenterPoints++;
    }
}