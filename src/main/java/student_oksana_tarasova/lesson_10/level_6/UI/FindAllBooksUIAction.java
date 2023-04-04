package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Set;

public class FindAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> allBook = bookDatabase.findUniqueBooks();
        System.out.println(allBook);
    }
}
