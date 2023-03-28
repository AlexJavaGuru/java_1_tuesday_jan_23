package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

public interface SearchCriteria {
    boolean match(Book book);
}
