package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    @Test
    void testMatch() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Harry Potter 1");
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book theShining = new Book("Stephen King", "The Shining");
        boolean result1 = titleSearchCriteria.match(harryPotter1);
        boolean result2 = titleSearchCriteria.match(theShining);
        assertTrue(result1);
        assertFalse(result2);
    }
}