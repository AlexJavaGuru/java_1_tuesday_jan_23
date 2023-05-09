package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.*;

import java.util.List;
import java.util.Scanner;

class FindByTitleAndAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindByTitleAndAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Book title to find: ");
        String title = scanner.nextLine();
        System.out.print("Book author to find: ");
        String author = scanner.nextLine();

        boolean result = bookDatabase.contains(new Book(author, title));
        System.out.println(result);

    }
}
