package student_ilya_tihonov.lesson_10.BookLibraryApplication.search;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if (leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        } else {
            return false;
        }
    }

}
