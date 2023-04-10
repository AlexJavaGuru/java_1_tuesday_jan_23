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
        OrderingService orderingService = new OrderingService();
        PagingService pagingService = new PagingService();
        GetAllBooksService getAllBooksService = new GetAllBooksService(storage);
        FindBookService findService = new FindBookService(storage, pagingService, orderingService);
        DeleteBookService deleteService = new DeleteBookService(storage);
        FindUniqueAuthorsService uniqueAuthorsService = new FindUniqueAuthorsService(storage);
        FIndUniqueTitlesService uniqueTitlesService = new FIndUniqueTitlesService(storage);
        FindUniqueBooksService uniqueBooksService = new FindUniqueBooksService(storage);
        GetBooksByAuthorsService getBooksByAuthorsService = new GetBooksByAuthorsService(storage);
        GetAuthorsBooksCountService getAuthorsBooksCountService = new GetAuthorsBooksCountService(storage);

        storage.saveBook(new Book("CBook","Stephen King", 1997));
        storage.saveBook(new Book("B1", "A", 2020));
        storage.saveBook(new Book("CBook","Stephen King", 1997));
        storage.saveBook(new Book("A1", "A1", 2018));
        storage.saveBook(new Book("BBook","Stephen King", 1999));


        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(saveBookService));
        menuNumberToActionMap.put(2, new FindByIdUIAction(findService));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(findService));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(findService));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(deleteService));
        menuNumberToActionMap.put(6, new OrderingPagingSearchUIAction(findService));
        menuNumberToActionMap.put(7, new GetAllBookUIAction(getAllBooksService));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(deleteService));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(uniqueAuthorsService));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(uniqueTitlesService));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(uniqueBooksService));
        menuNumberToActionMap.put(12, new GetBooksByAuthorsUIAction(getBooksByAuthorsService));
        menuNumberToActionMap.put(13, new GetAuthorsBookCountUIAction(getAuthorsBooksCountService));
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
        System.out.println("0.  Exit");
        System.out.println("1.  Save book");
        System.out.println("2.  Find book by ID");
        System.out.println("3.  Find book by author");
        System.out.println("4.  Find book by title");
        System.out.println("5.  Delete book by ID");
        System.out.println("6.  Find books by Author with Ordering and Paging");
        System.out.println("7.  Print all books in library");
        System.out.println("8.  Delete book by author");
        System.out.println("9.  Find unique authors");
        System.out.println("10. Find unique titles");
        System.out.println("11. Find unique books");
        System.out.println("12. Print Books by Authors");
        System.out.println("13. Print Authors and books count");
    }

}
