package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Book author to find: ");
        String author = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(author);
        System.out.println(bookList);

    }

}
