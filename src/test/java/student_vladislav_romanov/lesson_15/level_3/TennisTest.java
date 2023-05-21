package student_vladislav_romanov.lesson_15.level_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisTest {

    Tennis tennis;

    @BeforeEach
    void setUp() {
        tennis = new Tennis("Player1", "Player2");
    }

    @Test
    void wonPoint() {
        tennis.wonPoint("Player1");
        int expected = 1;
        int actual = tennis.player1.getScore();
        assertEquals(expected, actual);
    }

    @Test
    void score() {
        tennis.wonPoint("Player1");
        tennis.wonPoint("Player1");
        String expected = "Thirty - Love";
        String actual = tennis.score();
        assertEquals(expected, actual);
    }
}