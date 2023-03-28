package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.List;
import java.util.Map;

public class PagingSearchService {
    private BookDatabase storage;

    public PagingSearchService(BookDatabase storage) {
        this.storage = storage;
    }

    public Map<Integer, List<Book>> execute(Integer pageSize, SearchCriteria searchCriteria) {
        return storage.pagingSearch(pageSize, searchCriteria);
    }
}
