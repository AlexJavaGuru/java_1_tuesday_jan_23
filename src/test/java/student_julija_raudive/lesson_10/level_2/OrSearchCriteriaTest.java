package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    @Test
    void testMatch() {
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book harryPotter2 = new Book("J. K. Rowling", "Harry Potter 2");
        Book theShining = new Book("Stephen King", "The Shining");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("J. K. Rowling"), new TitleSearchCriteria("Harry Potter 1"));
        boolean result1 = orSearchCriteria.match(harryPotter1);
        boolean result2 = orSearchCriteria.match(harryPotter2);
        boolean result3 = orSearchCriteria.match(theShining);
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }
}