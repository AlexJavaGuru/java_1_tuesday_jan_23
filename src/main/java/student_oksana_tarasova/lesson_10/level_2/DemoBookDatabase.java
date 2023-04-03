package student_oksana_tarasova.lesson_10.level_2;

import student_oksana_tarasova.lesson_10.level_3.UniqueWordFinder;
import student_oksana_tarasova.lesson_10.level_6.UI.DeleteByIdUIAction;
import student_oksana_tarasova.lesson_10.level_6.UI.FindByIdUIAction;
import student_oksana_tarasova.lesson_10.level_6.UI.SaveBookUIAction;
import student_oksana_tarasova.lesson_10.level_7.PagingListBook;
import student_oksana_tarasova.lesson_10.level_7.SortListBook;


import java.util.*;
import java.util.Arrays;
import java.util.List;

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
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
//        bookDatabase.save(book);
//        bookDatabase.save(book1);
//        bookDatabase.save(book2);
//        bookDatabase.save(book3);
//        bookDatabase.save(book4);
//        bookDatabase.save(book3);
        System.out.println(books.size());
       //System.out.println(bookDatabase.toString());
       //System.out.println(books.subList(0, 0));
 PagingListBook pagingListBook = new PagingListBook(bookDatabase.getBooks(), 3);
        System.out.println(pagingListBook.paging().toString());
        System.out.println(bookDatabase.toString());
        SortListBook sortListBook = new SortListBook(bookDatabase.getBooks());
        sortListBook.sortedList();
        System.out.println(bookDatabase.getBooks());




//        System.out.println(bookDatabase.toString());
        //System.out.println(book.getId());
////        System.out.println(bookDatabase.toString());
        //System.out.println(book1.getId());
//
////        System.out.println(bookDatabase.toString());
//
//
//System.out.println(book2.getId());
//
////        System.out.println(bookDatabase.toString());
//        System.out.println(book3.getId());
//
//
//       System.out.println(book4.getId());
//
//        bookDatabase.save(book);
//        //System.out.println(bookDatabase.toString());
//        System.out.println(book.getId());
//        System.out.println(bookDatabase.getBooks());
//        //System.out.println(bookDatabase.toString());
//        System.out.println(bookDatabase.delete(4L));
//        System.out.println(bookDatabase.toString());
//        System.out.println();
//        System.out.println(bookDatabase.findById(2L));
//        System.out.println(bookDatabase.findById(1L));
//        System.out.println(bookDatabase.findById(1L));
//        System.out.println(bookDatabase.findById(1L));
//        System.out.println(bookDatabase.findById(2L));
//        System.out.println(bookDatabase.findById(1L));
        //System.out.println(bookDatabase.toString());
//        System.out.println(bookDatabase.findUniqueAuthors());
//
//        System.out.println(bookDatabase.findUniqueTitles());
//        System.out.println(bookDatabase.findUniqueBooks());
     //   System.out.println(bookDatabase.getAuthorToBooksMap());
       // System.out.println(bookDatabase.getEachAuthorBookCount());
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
//        System.out.println(bookDatabase.delete(book1));
//        System.out.println(bookDatabase.countAllBooks());
//
//        System.out.println(bookDatabase.delete(book2));
//        System.out.println(bookDatabase.countAllBooks());
//
//
//
//        System.out.println(bookDatabase.toString());
//        System.out.println(bookDatabase.findById(1L));
//
        //  System.out.println(bookDatabase.findByAuthor("primer1"));
        // System.out.println(bookDatabase.findByTitle("primer1"));
//
//        System.out.println(bookDatabase.countAllBooks());
//        bookDatabase.deleteByTitle("primer1");
//        System.out.println(bookDatabase.toString());
//        FindByIdUIAction findByIdUIAction = new FindByIdUIAction(bookDatabase);
//        findByIdUIAction.execute();
        //System.out.println(bookDatabase.getBooks());
        //System.out.println(bookDatabase.getBooks().size());

    }

}

class UniqueDemo {

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

class SaveUIDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        SaveBookUIAction saveBookUIAction = new SaveBookUIAction(new BookDatabaseImpl(books));
        saveBookUIAction.execute();
        System.out.println(bookDatabase.toString());
        saveBookUIAction.execute();
        System.out.println(bookDatabase.toString());
    }
}

class FindId {
    public static void main(String[] args) {
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2001");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1980");
        Book book4 = new Book("Pole", "Petrov", "2000");
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        FindByIdUIAction demo = new FindByIdUIAction(bookDatabase);
        demo.execute();
    }
}

class DeleteId {
    public static void main(String[] args) {
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2001");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1980");
        Book book4 = new Book("Pole", "Petrov", "2000");
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        DeleteByIdUIAction demo2 = new DeleteByIdUIAction(bookDatabase);
        demo2.execute();
    }
}
