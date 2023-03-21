package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Optional;

public interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    String printAllBooks();

    String findAllBooksByTheAuthor(String author);

    String findAuthorByFirstLetter(String firstLetterName);
}
