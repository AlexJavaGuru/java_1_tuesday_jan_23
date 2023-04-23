package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Set;

public class FindUniqueAuthorsUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> allBooksAuthors =bookDatabase.findUniqueAuthors();
        System.out.println("Book repository contains such authors: " +allBooksAuthors);
    }
}
