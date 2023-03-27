package student_vladislav_romanov.lesson_10.bookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите название: ");
        String title = scanner.nextLine();
        List<Book> booksList = bookDatabase.findByTitle(title);
        System.out.println(booksList.isEmpty() ? "Книг с названием " + title + " не найдено" : booksList);
    }
}
