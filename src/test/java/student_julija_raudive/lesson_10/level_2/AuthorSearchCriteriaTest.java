package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AuthorSearchCriteriaTest {


    @BeforeEach
    void setUp() {

    }

    @Test
    void testMatch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J. K. Rowling");
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book theShining = new Book("Stephen King", "The Shining");
        boolean result1 = authorSearchCriteria.match(harryPotter1);
        boolean result2 = authorSearchCriteria.match(theShining);
        assertTrue(result1);
        assertFalse(result2);

    }
}