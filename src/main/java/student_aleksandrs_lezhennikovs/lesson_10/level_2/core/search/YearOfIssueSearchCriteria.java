package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private Integer yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(Integer yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equals(this.yearOfIssueToSearch)) {
            return true;
        }
        return false;
    }

}