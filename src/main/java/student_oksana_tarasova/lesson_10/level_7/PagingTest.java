package student_oksana_tarasova.lesson_10.level_7;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PagingTest {
    public static void main(String[] args) {
        PagingTest test = new PagingTest();
        test.pagingTest();
        test.valueSellTest();
    }

    public void pagingTest() {
        Book book = new Book("На дне", "Горький", "1990");
        Book book1 = new Book("Война и мир", "Толстой", "2001");
        Book book2 = new Book("Чиполлино", "Родари", "2000");
        Book book3 = new Book("Гладиатор", "Посняков", "2010");
        Book book4 = new Book("Колонисты", "Кавано", "2000");
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
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
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        PagingListBook pagingListBook = new PagingListBook(bookDatabase.getBooks(), 4);
        int realResult = pagingListBook.paging().size();
        int expectedResult = 4;
        if (realResult == expectedResult) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
        }
    }

    public void valueSellTest() {
        Book book = new Book("На дне", "Горький", "1990");
        Book book1 = new Book("Война и мир", "Толстой", "2001");
        Book book2 = new Book("Чиполлино", "Родари", "2000");
        Book book3 = new Book("Гладиатор", "Посняков", "2010");
        Book book4 = new Book("Колонисты", "Кавано", "2000");
        List<Book> books = new ArrayList<>();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
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
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        PagingListBook pagingListBook = new PagingListBook(bookDatabase.getBooks(), 4);
        Map<Integer, List<Book>> bookMap = pagingListBook.paging();
        int realResult = bookMap.get(4).size();
        int expectedResult = 3;
        if (realResult == expectedResult) {
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
        }
    }
}
