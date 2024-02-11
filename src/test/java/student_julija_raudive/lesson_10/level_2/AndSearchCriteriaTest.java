package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {


    @Test
    void testMatch() {
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book harryPotter2 = new Book("J. K. Rowling", "Harry Potter 2");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("J. K. Rowling"), new TitleSearchCriteria("Harry Potter 1"));
        boolean result1 = andSearchCriteria.match(harryPotter1);
        boolean result2 = andSearchCriteria.match(harryPotter2);
        assertTrue(result1);
        assertFalse(result2);
    }
}