package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(this.titleToSearch)) {
            return true;
        }
        return false;
    }

}
