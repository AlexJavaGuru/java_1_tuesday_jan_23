package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

public class IdSearchCriteria implements SearchCriteria {
    private Long idToSearch;

    public IdSearchCriteria(Long idToSearch) {
        this.idToSearch = idToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getId().equals(idToSearch)) {
            return true;
        }
        return false;
    }
}
