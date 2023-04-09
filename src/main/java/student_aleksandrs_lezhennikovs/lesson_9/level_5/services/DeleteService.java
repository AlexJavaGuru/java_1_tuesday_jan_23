package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

public class DeleteService {
    private BookReader bookReader;

    public DeleteService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public void deleteBook(BookEntity book) {
        bookReader.delete(book);
    }

    public boolean checkBookBeforeDelete(BookEntity book) {
        return bookReader.notExistBook(book);
    }
}
