package student_aleksandrs_lezhennikovs.lesson_10.level_2;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui.DeleteByIdUIAction;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui.FIndByAuthorPagingUIAction;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui.GetAllBookUIAction;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.*;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabaseImpl;

import java.io.IOException;

class BookDBDemo {
    public static void main(String[] args) throws IOException {
        BookDatabase storage = new BookDatabaseImpl();
        FindBookService findService = new FindBookService(storage);
        DeleteBookService deleteService = new DeleteBookService(storage);
        PagingSearchService searchBookService = new PagingSearchService(storage);

        GetAllBooksService getAllBooksService = new GetAllBooksService(storage);
        GetAllBookUIAction getAllBookUIAction = new GetAllBookUIAction(getAllBooksService);
        FIndByAuthorPagingUIAction fIndByAuthorPagingUIAction = new FIndByAuthorPagingUIAction(searchBookService, getAllBooksService);
        //DeleteByIdService deleteByIdService = new DeleteByIdService(storage);
        DeleteByIdUIAction deleteByIdUIAction = new DeleteByIdUIAction(deleteService);
        for (int i = 1; i < 5; i++) {
            storage.saveBook(new Book("Book" + i,"Stephen King", 1990));
        }
        storage.saveBook(new Book("B1", "A", 2020));
        for (int i = 5; i < 9; i++) {
            storage.saveBook(new Book("Book" + i,"Stephen King", 1990));
        }
        //fIndByAuthorPagingUIAction.execute();
        getAllBookUIAction.execute();
        deleteByIdUIAction.execute();
        getAllBookUIAction.execute();
    }


}
