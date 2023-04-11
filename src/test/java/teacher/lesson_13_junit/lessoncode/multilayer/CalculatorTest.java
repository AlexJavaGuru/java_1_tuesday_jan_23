package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
        calculator = new Calculator();
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @Test
    void testCalculatorSumOfTwoInts() {
        System.out.println("Test 1");
        int expected = 15;
        int actual = calculator.sum(10, 5);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testCalculatorSumOfTwoIntsV2() {
        System.out.println("Test 2");
        int expected = -5;
        int actual = calculator.sum(5, -10);
        assertThat(actual).isEqualTo(expected);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }
}