package student_vladislav_romanov.lesson_10.bookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите автора: ");
        String author = scanner.nextLine();
        List<Book> booksList = bookDatabase.findByAuthor(author);
        System.out.println(booksList.isEmpty() ? "Книг автора " + author + " не найдено" : booksList);
    }
}
