package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.List;

public class FindBookService {
    private BookDatabase storage;

    public FindBookService(BookDatabase storage) {
        this.storage = storage;
    }

    public List<Book> execute(SearchCriteria searchCriteria) {
        return storage.find(searchCriteria);
    }
}
