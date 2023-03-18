package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.List;

public class GetUnreadBooksService {
    private BookReader bookReader;

    public GetUnreadBooksService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public List<BookEntity> returnUnreadBooks() {
        return bookReader.returnUnreadBooks();
    }
}
