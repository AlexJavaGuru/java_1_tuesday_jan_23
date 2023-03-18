package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

public class UnreadMarkBookService {
    private BookReader bookReader;

    public UnreadMarkBookService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public void unreadMarkBook (long bookId) {
        bookReader.markAsUnread(bookId);
    }
}
