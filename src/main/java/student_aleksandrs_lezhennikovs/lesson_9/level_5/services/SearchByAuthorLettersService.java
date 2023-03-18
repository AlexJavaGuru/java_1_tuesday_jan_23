package student_aleksandrs_lezhennikovs.lesson_9.level_5.services;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.List;

public class SearchByAuthorLettersService {
    private BookReader bookReader;

    public SearchByAuthorLettersService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public List<BookEntity> searchByAuthorLetters(String partOfName) {
        return bookReader.searchByAuthorLetters(partOfName);
    }
}
