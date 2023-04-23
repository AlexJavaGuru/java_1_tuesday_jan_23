package student_andrejs_cekalins.lesson_10.level_3;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}
