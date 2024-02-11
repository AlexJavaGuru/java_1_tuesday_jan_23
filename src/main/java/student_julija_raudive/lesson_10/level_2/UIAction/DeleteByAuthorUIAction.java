package student_julija_raudive.lesson_10.level_2.UIAction;


import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Book by author to delete: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);

    }
}
