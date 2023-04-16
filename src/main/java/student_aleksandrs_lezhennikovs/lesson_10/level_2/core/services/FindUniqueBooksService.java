package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;


import java.util.Set;

public class FindUniqueBooksService {
    BookDatabase storage;

    public FindUniqueBooksService(BookDatabase storage) {
        this.storage = storage;
    }

    public Set<Book> execute() {
        return storage.findUniqueBooks();
    }
}
