package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.List;

public class GetAllBooksService {
    private BookDatabase storage;

    public GetAllBooksService(BookDatabase storage) {
        this.storage = storage;
    }

    public List<Book> execute() {
        return storage.getAllBooks();
    }
}