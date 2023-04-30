package student_julija_raudive.lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);
    boolean bookDataIsOk(Book book);

    boolean deleteBook(Book book);

    List<String> displayBookList();

    List<String> findBookByAuthor(String author);

    List<String> findBookByTitle(String title);

    boolean markAsRead(Book book);

    boolean markAsUnread(Book book);

    List<String> displayFinishedBookList();

    List<String> displayUnreadBookList();
}
