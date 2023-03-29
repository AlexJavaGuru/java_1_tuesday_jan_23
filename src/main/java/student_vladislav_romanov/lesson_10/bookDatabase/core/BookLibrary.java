package student_vladislav_romanov.lesson_10.bookDatabase.core;

import student_vladislav_romanov.lesson_10.bookDatabase.uIActions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(22, new FillUpDbWithDefaultBooks(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Сохранить книгу - 1");
            System.out.println("Поиск книг по id (2), автору (3), названию (4)");
            System.out.println("Удалить книгу - 5");
            System.out.println("Количество книг - 6");
            System.out.println("Удалить книги конкретного автора - 7");
            System.out.println("Добавить книги по-умолчанию - 22");
            System.out.println("Выход - 0");
            System.out.print("Выберите раздел меню: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Благодарю! До свидания!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Раздел № " + userSelectedMenuNumber + " не существует");
        }
    }

}
