package student_aleksandrs_lezhennikovs.lesson_9.level_5.storage;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;

public interface BookReader {
    void add(BookEntity book);

    void delete(BookEntity book);

    boolean notExistBook(BookEntity book);

    boolean notNulls(BookEntity book);
}
