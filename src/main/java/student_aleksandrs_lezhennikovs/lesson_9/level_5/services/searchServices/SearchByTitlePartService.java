package student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.List;

public class SearchByTitlePartService {
    private BookReader bookReader;

    public SearchByTitlePartService(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    public List<BookEntity> searchByTitlePart(String partOfWord) {
        return bookReader.searchByTitleLetters(partOfWord);
    }
}
