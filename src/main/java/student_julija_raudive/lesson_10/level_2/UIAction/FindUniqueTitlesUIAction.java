package student_julija_raudive.lesson_10.level_2.UIAction;


import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Set<String> bookList = bookDatabase.findUniqueTitles();
        System.out.println("Unique title list: " + bookList);

    }
}
