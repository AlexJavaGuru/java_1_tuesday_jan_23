package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;
import student_oksana_tarasova.lesson_10.level_2.BookDatabaseImpl;

import java.util.*;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        List<Book> books = new ArrayList<>();
        BookDatabase bookDatabase = new BookDatabaseImpl(books);

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindBookByAuthorAndTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteBookUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new AllAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new AllTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new NumberOfAuthorsBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new PagingAuthorBooksUIAction(bookDatabase, 3));
        menuNumberToActionMap.put(15, new SortedListOfBooksUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        printMenu();
        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.next());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

    private void printMenu() {
        System.out.println("1 - enter book data;\n" +
                "2 - find a book by number;\n" +
                "3 - find a book by author;\n" +
                "4 - find a book by title;\n" +
                "5 - find a book by author and title;\n" +
                "6 - delete book by author;\n" +
                "7 - delete book by title;\n" +
                "8 - delete book by id number;\n" +
                "9 - delete book;\n" +
                "10 - list of all book authors in the library;\n" +
                "11 - list of all book titles in the library;\n" +
                "12 - list of all books in the library;\n" +
                "13 - number of author's books in the library;\n" +
                "14 - view the list of found books by the author by page;\n" +
                "15 - search for books by year of publication sorted by author");
    }
}
