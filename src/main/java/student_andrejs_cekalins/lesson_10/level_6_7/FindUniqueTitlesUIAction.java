package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String>allBooksTitles=bookDatabase.findUniqueTitles();
        System.out.println("Book repository contains such titles: " +allBooksTitles);
    }
}
