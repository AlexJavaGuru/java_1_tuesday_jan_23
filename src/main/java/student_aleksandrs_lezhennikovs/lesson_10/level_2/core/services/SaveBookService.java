package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

public class SaveBookService {
    BookDatabase storage;

    public SaveBookService(BookDatabase storage) {
        this.storage = storage;
    }

    public void saveBook(Book book) {
        storage.saveBook(book);
    }
}
