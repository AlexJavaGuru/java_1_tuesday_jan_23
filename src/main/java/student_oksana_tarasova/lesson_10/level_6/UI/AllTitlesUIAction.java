package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Set;

public class AllTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public AllTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> allTitles = bookDatabase.findUniqueTitles();
        System.out.println(allTitles);
    }
}
