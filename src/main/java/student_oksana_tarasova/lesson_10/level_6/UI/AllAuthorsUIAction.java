package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Set;

public class AllAuthorsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public AllAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> allAuthors = bookDatabase.findUniqueAuthors();
        System.out.println(allAuthors);
    }
}
