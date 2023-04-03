package student_oksana_tarasova.lesson_10.level_7;

import student_oksana_tarasova.lesson_10.level_2.Book;

import java.util.*;

public class SortListBook {

    List<Book> books;

    public SortListBook(List<Book> books) {
        this.books = books;
    }

    public void sortedList() {
        books.sort(Book::compareTo);
    }
}
