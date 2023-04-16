package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

public class MarkBookAsReadService {
    private BookReader bookReader;

    public MarkBookAsReadService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public void markBookAsRaed(long bookId) {
        bookReader.markAsRead(bookId);
    }
}
