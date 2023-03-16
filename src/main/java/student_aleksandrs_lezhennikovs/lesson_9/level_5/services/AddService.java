package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

public class AddService {
    private BookReader bookReader;

    public AddService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public void addBook(String title, String author) {
        BookEntity book = new BookEntity(title, author);
        bookReader.add(book);
    }
}
