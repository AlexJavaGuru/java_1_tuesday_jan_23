package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Set<Book> bookList = bookDatabase.findUniqueBooks();
        System.out.println("Unique book list: " + bookList);

    }
}
