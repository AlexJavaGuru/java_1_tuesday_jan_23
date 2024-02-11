package student_ilya_tihonov.lesson_10.BookLibraryApplication.search;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equals(this.yearOfIssueToSearch)) {
            return true;
        } else {
            return false;
        }
    }

}
