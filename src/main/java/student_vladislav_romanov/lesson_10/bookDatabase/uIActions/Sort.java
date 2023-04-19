package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;

import java.util.Collections;
import java.util.List;

public class Sort {

    public List<Book> ascSorting(List<Book> list) {
        Collections.sort(list);
        return list;
    }

    public List<Book> descSorting(List<Book> list) {
        Collections.reverse(list);
        return list;
    }

}
