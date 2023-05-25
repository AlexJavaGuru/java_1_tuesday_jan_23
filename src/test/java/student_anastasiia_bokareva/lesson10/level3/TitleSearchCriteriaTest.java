package student_anastasiia_bokareva.lesson10.level3;

import org.junit.jupiter.api.Test;
import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabaseImpl;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    @Test
    void checkMatchAuthor(){
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("HR");
        Book book = new Book("HR","Allay");
        boolean real = criteria.match(book);
        boolean expect = true;
        assertEquals(real,expect);
    }

    @Test
    void checkMatchTitle(){
        TitleSearchCriteria criteria = new TitleSearchCriteria("Allay");
        Book book = new Book("HR","Allay");
        boolean real = criteria.match(book);
        boolean expect = true;
        assertEquals(real,expect);
    }

}