package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.List;

public class SearchByAuthorService {
    private BookReader bookReader;

    public SearchByAuthorService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public List<BookEntity> searchByAuthor(String author) {
        return bookReader.searchByAuthor(author);
    }
}
