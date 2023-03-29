package student_oksana_tarasova.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;

public class DemoBookDatabase {

    public static void main(String[] args) {
        Book book = new Book("primer1", "primer1");
        Book book1 = new Book( "primer2", "primer2");
        Book book2 = new Book("prime3", "primer3");
        Book book3 = new Book("primer4", "primer4");
        Book book4 = new Book("primer5", "primer5");
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        System.out.println(bookDatabase.toString());

        bookDatabase.save(book);
        System.out.println(bookDatabase.toString());
        System.out.println(book.getId());

        bookDatabase.save(book1);
        System.out.println(bookDatabase.toString());
        System.out.println(book1.getId());

        bookDatabase.save(book2);
        System.out.println(bookDatabase.toString());
        System.out.println(book2.getId());

        bookDatabase.save(book3);
        System.out.println(bookDatabase.toString());
        System.out.println(book3.getId());

        bookDatabase.save(book4);
        System.out.println(bookDatabase.toString());
        System.out.println(book4.getId());

        bookDatabase.save(book);
        System.out.println(bookDatabase.toString());
        System.out.println(book.getId());

        System.out.println(bookDatabase.countAllBooks());

      System.out.println(bookDatabase.delete(4L));
      System.out.println(bookDatabase.toString());

//        System.out.println(bookDatabase.delete(book1));
//        System.out.println(bookDatabase.countAllBooks());
//
//        System.out.println(bookDatabase.delete(book2));
//        System.out.println(bookDatabase.countAllBooks());
//
//
//        System.out.println(bookDatabase.findById(4L));
//        System.out.println(bookDatabase.toString());
//        System.out.println(bookDatabase.findById(1L));
//
//        System.out.println(bookDatabase.findByAuthor("primer1"));
//        System.out.println(bookDatabase.findByTitle("primer1"));
//
//        System.out.println(bookDatabase.countAllBooks());

//        bookDatabase.deleteByTitle("primer1");
//        System.out.println(bookDatabase.toString());

        //System.out.println(bookDatabase.getBooks());
        System.out.println(bookDatabase.getBooks().size());
    }

}
