package student_oksana_tarasova.lesson_10.level_7;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabaseImpl;

import java.util.ArrayList;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        SortTest test = new SortTest();
        test.sortTest();
    }

    public void sortTest() {
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
        SortListBook sortListBook = new SortListBook(bookDatabase.getBooks());
        sortListBook.sortedList();
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book4);
        expectedResult.add(book3);
        expectedResult.add(book2);
        expectedResult.add(book1);

        for (int i = 0; i < realResult.size(); i++) {
            if (realResult.get(i).getAuthor().equals(expectedResult.get(i).getAuthor())) {
                System.out.println("Test is passed");
            } else {
                System.out.println(" Test is fail");
            }
        }
    }
}
