package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

public class GetAuthorToBooksMap implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorToBooksMap(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("List of author books: " + bookDatabase.getAuthorToBooksMap());
    }
}
