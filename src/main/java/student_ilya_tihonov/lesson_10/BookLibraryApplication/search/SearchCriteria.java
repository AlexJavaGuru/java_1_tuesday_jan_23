package student_ilya_tihonov.lesson_10.BookLibraryApplication.search;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;

public interface SearchCriteria {

    boolean match(Book book);

}
