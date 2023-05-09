package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.List;
import java.util.Map;


class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        System.out.print("Book list by author: \n");
        Map<String, List<Book>> list = bookDatabase.getAuthorToBooksMap();
        System.out.println(list);

    }
}
