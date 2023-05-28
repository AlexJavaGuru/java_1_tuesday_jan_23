package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void testIsPalindrome() {
        String expected = "racecar";
        boolean actual = palindrome.isPalindrome("racecar");
        assertEquals(expected, actual);
    }

    @Test
    void testNotPalindrome() {
        String expected = "hello";
        boolean actual = palindrome.isPalindrome("hello");
        assertEquals(expected, actual);
    }
}