package student_vladislav_romanov.lesson_10.bookDatabase.search;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;

public interface SearchCriteria {

    boolean match(Book book);

}
