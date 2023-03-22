package student_oksana_tarasova.Lesson_9.level_5;

public interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    String printAllBooks();

    String findAllBooksByTheAuthor(String author);

    String findAuthorByFirstLetter(String firstLetterName);

    String findBooksByTitle(String titleBook);

    boolean markABookAsRead(Book book);

    boolean markABookAsUnread(Book book);
}
