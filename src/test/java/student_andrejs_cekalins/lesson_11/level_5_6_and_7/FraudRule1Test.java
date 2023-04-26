package student_andrejs_cekalins.lesson_11.level_5_6_and_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_andrejs_cekalins.lesson_11.level_4.Trader;
import student_andrejs_cekalins.lesson_11.level_4.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {
    private FraudRule1 subject1;
    private FraudRule2 subject2;
    private FraudRule3 subject3;
    private FraudRule4 subject4;
    private FraudRule5 subject5;


    @BeforeEach
    void setUp() {
        subject1 = new FraudRule1("Trader Pokemon");
        subject2 = new FraudRule2("Sum moe than 1000000");
        subject3 = new FraudRule3("Traders from Sydney");
        subject4 = new FraudRule4("Traders from Jamaica");
        subject5 = new FraudRule5("Traders from Germany amount more than 1000");
    }

    @Test
    void testFraudRule1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 2000);
        boolean expected = true;
        boolean actual = subject1.isFraud(pokemonTransaction);
        assertEquals(actual, expected);
    }

    @Test
    void testNotFraudRule1() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 2000);
        boolean expected = true;
        boolean actual = subject1.isFraud(pokemonTransaction);
        assertNotEquals(actual, expected);
    }

    @Test
    void testFraudRule2() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000001);
        boolean expected = true;
        boolean actual = subject2.isFraud(pokemonTransaction);
        assertEquals(actual, expected);
    }

    @Test
    void testNotFraudRule2() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        boolean expected = true;
        boolean actual = subject2.isFraud(pokemonTransaction);
        assertNotEquals(actual, expected);
    }

    @Test
    void testFraudRule3() {
        Trader trader = new Trader("Pikachu", "Sydney", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        boolean expected = true;
        boolean actual = subject3.isFraud(pokemonTransaction);
        assertEquals(actual, expected);
    }

    @Test
    void testNotFraudRule3() {
        Trader trader = new Trader("Pikachu", "Sydnay", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        boolean expected = true;
        boolean actual = subject3.isFraud(pokemonTransaction);
        assertNotEquals(actual, expected);
    }

    @Test
    void testFraudRule4() {
        Trader trader = new Trader("Pikachu", "Riga", "Jamaica");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        boolean expected = true;
        boolean actual = subject4.isFraud(pokemonTransaction);
        assertEquals(actual, expected);
    }

    @Test
    void testNotFraudRule4() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        boolean expected = true;
        boolean actual = subject4.isFraud(pokemonTransaction);
        assertNotEquals(actual, expected);
    }

    @Test
    void testFraudRule5() {
        Trader trader = new Trader("Pikachu", "Riga", "Germany");
        Transaction pokemonTransaction = new Transaction(trader, 1001);
        boolean expected = true;
        boolean actual = subject5.isFraud(pokemonTransaction);
        assertEquals(actual, expected);
    }

    @Test
    void testNotFraudRule5() {
        Trader trader = new Trader("Pikachu", "Riga", "Germany");
        Transaction pokemonTransaction = new Transaction(trader, 1000);
        boolean expected = true;
        boolean actual = subject5.isFraud(pokemonTransaction);
        assertNotEquals(actual, expected);
    }
}