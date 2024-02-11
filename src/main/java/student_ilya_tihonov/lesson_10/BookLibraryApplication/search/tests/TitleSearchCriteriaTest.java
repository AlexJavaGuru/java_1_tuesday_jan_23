package student_ilya_tihonov.lesson_10.BookLibraryApplication.search.tests;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.TitleSearchCriteria;

public class TitleSearchCriteriaTest {

    public static void main(String[] args) {
        TitleSearchCriteriaTest titleSearchCriteriaTest = new TitleSearchCriteriaTest();
        titleSearchCriteriaTest.testMatch();
    }


    public void testMatch(){

        Book book1 = new Book("Author 1", "Book 1", "100");

        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Book 1");

        if (titleSearchCriteria.match(book1)) {
            System.out.println("Ok");
        } else {
            System.out.println("Failed");
        }
    }

}
