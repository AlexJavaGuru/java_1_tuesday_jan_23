package student_andrejs_cekalins.lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    List<String> listOfBooks();

    List<String> authorBooks(String author);
}
