package student_andrejs_cekalins.lesson_15.level_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;
    Movie movieRegular;
    Movie movieNewRelease;
    Movie movieChildren;

    @BeforeEach
    void setUp() {
        customer = new Customer("Andrejs");
        movieRegular = new Movie("Rambo", MovieCategory.REGULAR);
        movieNewRelease = new Movie("Pinocchio", MovieCategory.NEW_RELEASE);
        movieChildren = new Movie("Dumbo", MovieCategory.CHILDREN);
    }

    @Test
    void frequentRenterPointsRegularAndChildrenEqualOneDay() {
        customer.addRental(new Rental(movieRegular, 1));
       String statement = customer.statement();
       int frequentRenterPoints =customer.getFrequentRenterPoints();
       int expected = 1;
        assertThat(frequentRenterPoints).isEqualTo(expected);


    }

    @Test
    void frequentRenterPointsRegularAndChildrenMoreThanOneDay() {
        customer.addRental(new Rental(movieRegular, 3));
        String statement = customer.statement();
        int frequentRenterPoints =customer.getFrequentRenterPoints();
        int expected = 1;
        assertThat(frequentRenterPoints).isEqualTo(expected);
    }

    @Test
    void frequentRenterPointsForNewReleaseMoreThanOneDay() {
        customer.addRental(new Rental(movieNewRelease, 2));
        String statement = customer.statement();
        int frequentRenterPoints =customer.getFrequentRenterPoints();
        int expected = 2;
        assertThat(frequentRenterPoints).isEqualTo(expected);
    }
    @Test
    void frequentRenterPointsForNewReleaseEqualsOneDay() {
        customer.addRental(new Rental(movieNewRelease, 1));
        String statement = customer.statement();
        int frequentRenterPoints =customer.getFrequentRenterPoints();
        int expected = 1;
        assertThat(frequentRenterPoints).isEqualTo(expected);
    }
    @Test
    void regularAmountMoreThanTwoDaysRent() {
        customer.addRental(new Rental(movieRegular, 3));
        String statement = customer.statement();
        double amount = customer.getTotalAmount();
        double expected = 3.5;
        assertThat(amount).isEqualTo(expected);
    }
    @Test
    void regularAmountEqualTwoDaysRent() {
        customer.addRental(new Rental(movieRegular, 2));
        String statement = customer.statement();
        double amount = customer.getTotalAmount();
        double expected =2;
        assertThat(amount).isEqualTo(expected);
    }
    @Test
    void childrenAmountMoreThanThreeDaysRent() {
        customer.addRental(new Rental(movieChildren, 4));
        String statement = customer.statement();
        double amount = customer.getTotalAmount();
        double expected =3;
        assertThat(amount).isEqualTo(expected);
    }
    @Test
    void childrenAmountLessOrEqualThanThreeDaysRent() {
        customer.addRental(new Rental(movieChildren, 3));
        String statement = customer.statement();
        double amount = customer.getTotalAmount();
        double expected =1.5;
        assertThat(amount).isEqualTo(expected);
    }
    @Test
    void newReleaseAmount() {
        customer.addRental(new Rental(movieNewRelease, 4));
        String statement = customer.statement();
        double amount = customer.getTotalAmount();
        double expected =12;
        assertThat(amount).isEqualTo(expected);
    }

}