package student_ilya_tihonov.lesson_10.BookLibraryApplication.search.tests;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.AuthorSearchCriteria;

public class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.testMatch();
    }
    public void testMatch(){

        Book book1 = new Book("Author 1", "Book 1", "100");

        AuthorSearchCriteria authorSearchCriteria  = new AuthorSearchCriteria("Author 1");

        if (authorSearchCriteria.match(book1)) {
            System.out.println("Ok");
        } else {
            System.out.println("Failed");
        }
    }
}
