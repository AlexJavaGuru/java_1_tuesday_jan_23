package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.Set;

public class FIndUniqueTitlesService {
    BookDatabase storage;

    public FIndUniqueTitlesService(BookDatabase storage) {
        this.storage = storage;
    }

    public Set<String> execute() {
        return storage.findUniqueTitles();
    }
}
