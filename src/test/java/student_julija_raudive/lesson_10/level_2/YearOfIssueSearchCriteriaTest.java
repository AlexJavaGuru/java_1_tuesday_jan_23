package student_julija_raudive.lesson_10.level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfIssueSearchCriteriaTest {

    @Test
    void testMatch() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1997");
        Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
        Book theShining = new Book("Stephen King", "The Shining");
        harryPotter1.setYearOfIssue("1997");
        theShining.setYearOfIssue("1977");
        boolean result1 = yearOfIssueSearchCriteria.match(harryPotter1);
        boolean result2 = yearOfIssueSearchCriteria.match(theShining);
        assertTrue(result1);
        assertFalse(result2);
    }
}