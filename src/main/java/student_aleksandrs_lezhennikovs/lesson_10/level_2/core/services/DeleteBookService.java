package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

public class DeleteBookService {
    BookDatabase storage;

    public DeleteBookService(BookDatabase storage) {
        this.storage = storage;
    }

    public boolean execute(SearchCriteria searchCriteria) {
        return storage.delete(searchCriteria);
    }
}
