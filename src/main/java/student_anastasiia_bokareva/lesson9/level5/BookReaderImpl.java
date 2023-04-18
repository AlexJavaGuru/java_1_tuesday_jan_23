package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

 public class BookReaderImpl implements BookReader {

    public boolean add(ArrayList<Book> books, Book newBook) {
        if (books.contains(newBook)) {
            return false;
        } else {
            books.add(newBook);
            return true;
        }
    }

     public boolean addNotNull(ArrayList<Book> books, Book newBook) {
         if ((newBook.getBookName() != "")&& (newBook.getBookAuthor()!= "")) {
             return add(books, newBook);
         } else {
             return false;
         }
     }

     @Override
     public boolean delete(ArrayList<Book> books, Book newBook) {
         return books.remove(newBook);
     }
 }