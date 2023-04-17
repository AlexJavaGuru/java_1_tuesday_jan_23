package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Map;

public class NumberOfAuthorsBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public NumberOfAuthorsBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> numberAuthorBooks = bookDatabase.getEachAuthorBookCount();
        System.out.println(numberAuthorBooks);
    }
}
