package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;
import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.Scanner;
import java.util.Set;

public class FindUniqueUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        switch (askListCriteria()) {
            case 1 -> printFindResultsList(bookDatabase.findUniqueAuthors());
            case 2 -> printFindResultsList(bookDatabase.findUniqueTitles());
            case 3 -> printFindResultsBooks(bookDatabase.findUniqueBooks());
        }

    }

    private int askListCriteria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список всех уникальных авторов - 1");
        System.out.println("Список всех уникальных названий - 2");
        System.out.println("Список всех уникальных книг - 3");
        System.out.print("Пожалуйста введите номер операции: ");

        return scanner.nextInt();
    }

    private void printFindResultsList(Set<String> result) {
        System.out.println(result);
    }

    private void printFindResultsBooks(Set<Book> result) {
        System.out.println(result);
    }

}
