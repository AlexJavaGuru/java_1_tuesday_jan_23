package student_dmitry_kupcus.lesson_9.level_5;

public interface BookReader {
     boolean addBook(Book book);
     boolean deleteBook(Book book);

     String showAllBooks();
     boolean finByAuthorName(String bookAuthor);
     boolean findByBookName(String word);
     boolean markAsRead(Book book, String bookName);
     boolean markAsUnread(Book book, String bookName);

}
