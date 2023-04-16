package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

public class GetEachAuthorBookCountUIAction implements UIAction {

    BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------------------");
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }

}
