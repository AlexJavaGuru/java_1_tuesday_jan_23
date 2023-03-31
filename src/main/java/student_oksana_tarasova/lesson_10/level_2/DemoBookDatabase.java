package student_oksana_tarasova.lesson_10.level_2;

import student_oksana_tarasova.lesson_10.level_3.UniqueWordFinder;

import java.util.*;
import java.util.Arrays;

public class DemoBookDatabase {

    public static void main(String[] args) {
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2001");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1980");
        Book book4 = new Book("Pole", "Petrov", "2000");
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
        System.out.println(bookDatabase.getBooks());

//        System.out.println(bookDatabase.findUniqueAuthors());
//
//        System.out.println(bookDatabase.findUniqueTitles());
//        System.out.println(bookDatabase.findUniqueBooks());
        System.out.println(bookDatabase.getAuthorToBooksMap());
        System.out.println(bookDatabase.getEachAuthorBookCount());
//        Set<Book> books1 = new HashSet<>();
//        books1.add(book);
//        books1.add(book1);
//        books1.add(book2);
//        books1.add(book3);
//        books1.add(book4);
//System.out.println(books1.toString());
//        for (Book book5 : books1) {
//            System.out.println(book5);
//            System.out.println(book5.hashCode());
//        }

//        System.out.println(books1.size());

//        System.out.println(bookDatabase.countAllBooks());

//      System.out.println(bookDatabase.delete(4L));
//      System.out.println(bookDatabase.toString());

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
        //  System.out.println(bookDatabase.findByAuthor("primer1"));
        // System.out.println(bookDatabase.findByTitle("primer1"));
//
//        System.out.println(bookDatabase.countAllBooks());

//        bookDatabase.deleteByTitle("primer1");
//        System.out.println(bookDatabase.toString());

        //System.out.println(bookDatabase.getBooks());
        //System.out.println(bookDatabase.getBooks().size());


    }

}

class UniqueDemo {
//    @Override
//    public String toString() {
//        return "UniqueDemo{}";
//    }

    public static void main(String[] args) {

        UniqueDemo demo = new UniqueDemo();
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "Oracle SQL Developer is a free, integrated development " +
                "environment that simplifies the development and management of" ;
        String[] strings = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        System.out.println(Arrays.toString(strings));
        Set<String> unique = new HashSet<>();
        for (String string : strings) {
            unique.add(string);
        }
         System.out.println(unique);

    }
}
