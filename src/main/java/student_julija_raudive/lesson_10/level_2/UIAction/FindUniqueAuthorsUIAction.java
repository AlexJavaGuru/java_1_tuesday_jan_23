package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.Set;

class FindUniqueAuthorsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Set<String> bookList = bookDatabase.findUniqueAuthors();
        System.out.println("Unique author list: " + bookList);

    }
}
