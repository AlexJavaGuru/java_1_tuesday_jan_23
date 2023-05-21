package student_vladislav_romanov.lesson_15.level_6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer("Mister Twister");
        assertThat(customer.getName()).isEqualTo(new Customer("Mister Twister").getName());
    }

    @Test
    void statementOweAmount() {
        Customer customer = new Customer("Mister Twister");
        double expectedOweAmount = (5 * 3) + (1.5 + ((13 - 3) * 1.5)) + (2 + ((3 - 2) * 1.5));
        assertThat(expectedOweAmount).isEqualTo(customer.calculateMovieOweAmount(MovieTypes.NEW_RELEASE, 5) + customer.calculateMovieOweAmount(MovieTypes.CHILDREN, 13) + customer.calculateMovieOweAmount(MovieTypes.REGULAR, 3));
    }

    @Test
    void statementRenterPoints() {
        Customer customer = new Customer("Mister Twister");
        int expectedRenterPoints = 1 + 1 + 2;
        assertThat(expectedRenterPoints).isEqualTo(customer.calculateFrequentRenterPoints(MovieTypes.NEW_RELEASE, 5) + customer.calculateFrequentRenterPoints(MovieTypes.CHILDREN, 13) + customer.calculateFrequentRenterPoints(MovieTypes.REGULAR, 3));
    }
}