package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;


import java.util.List;
import java.util.Map;

public class GetBooksByAuthorsService {
    private BookDatabase storage;

    public GetBooksByAuthorsService(BookDatabase storage) {
        this.storage = storage;
    }

    public Map<String, List<Book>> execute() {
        return storage.getAuthorToBooksMap();
    }
}
