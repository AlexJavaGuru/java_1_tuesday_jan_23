package student_oksana_tarasova.lesson_10.level_3;

import student_oksana_tarasova.lesson_10.level_2.Book;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equalsIgnoreCase(this.titleToSearch)) {
            return true;
        }
        return false;
    }
}
