package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Book title to find: ");
        String title = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByTitle(title);
        System.out.println(bookList);

    }

}
