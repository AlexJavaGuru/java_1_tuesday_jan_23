package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.*;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabaseImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase storage = new BookDatabaseImpl();
        SaveBookService saveBookService = new SaveBookService(storage);
        PagingSearchService pagingSearchServiceByAuthor = new PagingSearchService(storage);
        GetAllBooksService getAllBooksService = new GetAllBooksService(storage);
        //DeleteByIdService deleteByIdService = new DeleteByIdService(storage);
        FindBookService findService = new FindBookService(storage);
        DeleteBookService deleteService = new DeleteBookService(storage);

        for (int i = 1; i < 5; i++) {
            storage.saveBook(new Book("Book" + i,"Stephen King", 1990));
        }
        storage.saveBook(new Book("B1", "A", 2020));
        for (int i = 5; i < 9; i++) {
            storage.saveBook(new Book("Book" + i,"Stephen King", 1990));
        }

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(saveBookService));
        menuNumberToActionMap.put(2, new FindByIdUIAction(findService));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(findService));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(findService));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(deleteService));
        menuNumberToActionMap.put(6, new FIndByAuthorPagingUIAction(pagingSearchServiceByAuthor, getAllBooksService));
        menuNumberToActionMap.put(7, new GetAllBookUIAction(getAllBooksService));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(deleteService));
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) throws IOException {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
    private void printMenu() {
        System.out.println("Main menu");
        System.out.println("0. Exit");
        System.out.println("1. Save book");
        System.out.println("2. Find book by ID");
        System.out.println("3. Find book by author");
        System.out.println("4. Find book by title");
        System.out.println("5. Delete book by ID");
        System.out.println("6. Find books by Author with Paging");
        System.out.println("7. Print all books in library");
        System.out.println("8. Delete book by author");
    }

}
