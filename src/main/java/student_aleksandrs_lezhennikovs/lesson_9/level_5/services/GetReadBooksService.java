package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.List;

public class GetReadBooksService {
    private BookReader bookReader;

    public GetReadBooksService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public List<BookEntity> returnReadBooks() {
        return bookReader.returnReadBooks();
    }
}
