package student_oksana_tarasova.lesson_10.level_3;

import student_oksana_tarasova.lesson_10.level_2.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getAuthor().equals(this.authorToSearch)) {
            return true;
        }
        return false;
    }
}
