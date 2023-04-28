package student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CustomerTest {
    private Customer customer;
    private Movie spiderman;
    private Movie spiderman2;
    private Movie bamby;
    private Movie bamby2;
    private Movie angelika;
    private Movie angelika2;

    @BeforeEach
    void setUp() {
        customer = new Customer("Alex");
        spiderman = new Movie("Spiderman", Categories.NEW_RELEASE);
        spiderman2 = new Movie("Spiderman2", Categories.NEW_RELEASE);
        bamby = new Movie("Bamby", Categories.CHILDRENS);
        bamby2 = new Movie("Bamby2", Categories.CHILDRENS);
        angelika = new Movie("Angelika", Categories.REGULAR);
        angelika2 = new Movie("Angelika2", Categories.REGULAR);


    }

    @Test
    void testInitialTextResult() {
        customer.addRental(new Rental(spiderman, 1));
        String calculated = customer.statement();
        int calc = customer.getFrequentRentPoints();
        String expect = "Rental Record for " + "Alex" + "\n" + "\t" + "Spiderman" + "\t"
                + "3.0" + "\n" + "You owed " + "3.0" + "\n" + "You earned " + "1" + " frequent renter points\n";
        assertThat(calculated).isEqualTo(expect);
    }

    @Test
    void testFrequentRenterPointsOneDaysRentForNewRelease() {
        customer.addRental(new Rental(spiderman, 1));
        String calculated = customer.statement();
        int calc = customer.getFrequentRentPoints();
        assertThat(calc).isEqualTo(1);
    }

    @Test
    void testFrequentRenterPointsLessMoreThanOneDaysRentForNewRelease() {
        customer.addRental(new Rental(spiderman, 10));
        String calculated = customer.statement();
        int calc = customer.getFrequentRentPoints();
        assertThat(calc).isEqualTo(2);
    }

    @Test
    void testFrequentRenterPointsLessMoreThanOneDaysRentForNOTNewRelease() {
        customer.addRental(new Rental(bamby, 10));
        String calculated = customer.statement();
        int calc = customer.getFrequentRentPoints();
        assertThat(calc).isEqualTo(1);
    }

    @Test
    void testTotalAmountForNewRelease() {
        customer.addRental(new Rental(spiderman, 1));
        String calculated = customer.statement();
        double calc = customer.getTotalPrice();
        assertThat(calc).isEqualTo(3);
    }

    @Test
    void testTotalAmountForRegularLessThanThreeDaysRent() {
        customer.addRental(new Rental(angelika, 2));
        String calculated = customer.statement();
        double calc = customer.getTotalPrice();
        assertThat(calc).isEqualTo(2);
    }
    @Test
    void testTotalAmountForRegularMoreThanTwoDaysRent() {
        customer.addRental(new Rental(angelika, 3));
        String calculated = customer.statement();
        double calc = customer.getTotalPrice();
        assertThat(calc).isEqualTo(3.5);
    }

    @Test
    void testTotalAmountForChildrenLessThanFourDaysRent() {
        customer.addRental(new Rental(bamby, 3));
        String calculated = customer.statement();
        double calc = customer.getTotalPrice();
        assertThat(calc).isEqualTo(1.5);
    }
    @Test
    void testTotalAmountForChildrenMoreThanThreeDaysRent() {
        customer.addRental(new Rental(bamby, 4));
        String calculated = customer.statement();
        double calc = customer.getTotalPrice();
        assertThat(calc).isEqualTo(3);
    }
}