package student_oksana_tarasova.lesson_10.level_1;

import java.util.List;
import java.util.ArrayList;

public class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook);
        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println(notContainsBook);
    }
}
