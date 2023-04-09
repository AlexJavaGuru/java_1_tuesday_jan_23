package student_aleksandrs_lezhennikovs.lesson_9.level_5;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.*;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions.SearchByAuthorLettersUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions.SearchByAuthorUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions.SearchByTitlePartUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions.SearchByTitleUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.*;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorLettersService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitlePartService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitleService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReaderImpl;

class BookReaderDemo {
    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl();
        AddService addService = new AddService(bookReader);
        UIActions uiActions = new AddUIAction(addService);
        uiActions.execute();

        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        bookReader.add(firstBook);
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        secondBook.setRead(true);
        bookReader.add(secondBook);
        BookEntity theSameBook = new BookEntity("Lāčplēsis", "Andrejs Pumpurs");
        bookReader.add(theSameBook);
        BookEntity nullBook = new BookEntity(null, null);
        bookReader.add(nullBook);
        BookEntity thirdBook = new BookEntity("Some title", "Some Author");
        bookReader.add(thirdBook);

        /*DeleteService deleteService = new DeleteService(bookReader);
        DeleteUIAction deleteUIAction = new DeleteUIAction(deleteService);
        deleteUIAction.execute();*/
        GetAllService getAllService = new GetAllService(bookReader);
        GetAllUIAction getAllUIAction = new GetAllUIAction(getAllService);
        getAllUIAction.execute();
        SearchByAuthorService searchByAuthorService = new SearchByAuthorService(bookReader);
        SearchByAuthorUIAction searchByAuthorUIAction = new SearchByAuthorUIAction(searchByAuthorService);
        searchByAuthorUIAction.execute();

        SearchByAuthorLettersService searchByAuthorLettersService = new SearchByAuthorLettersService(bookReader);
        SearchByAuthorLettersUIAction searchByAuthorLettersUIAction = new SearchByAuthorLettersUIAction(searchByAuthorLettersService);
        searchByAuthorLettersUIAction.execute();

        SearchByTitleService searchByTitleService = new SearchByTitleService(bookReader);
        SearchByTitleUIAction searchByTitleUIAction = new SearchByTitleUIAction(searchByTitleService);
        searchByTitleUIAction.execute();

        SearchByTitlePartService searchByTitlePartService = new SearchByTitlePartService(bookReader);
        SearchByTitlePartUIAction searchByTitlePartUIAction = new SearchByTitlePartUIAction(searchByTitlePartService);
        searchByTitlePartUIAction.execute();

        MarkBookAsReadService markBookAsReadService = new MarkBookAsReadService(bookReader);
        MarkBookAsReadUIAction markBookAsReadUIAction = new MarkBookAsReadUIAction(markBookAsReadService);
        markBookAsReadUIAction.execute();
        getAllUIAction.execute();

        UnreadMarkBookService unreadMarkBookService = new UnreadMarkBookService(bookReader);
        UnreadMarkBookUIService unreadMarkBookUIService = new UnreadMarkBookUIService(unreadMarkBookService);
        unreadMarkBookUIService.execute();
        getAllUIAction.execute();

        GetUnreadBooksService getUnreadBooksService = new GetUnreadBooksService(bookReader);
        GetUnreadBooksUIAction getUnreadBooksUIAction = new GetUnreadBooksUIAction(getUnreadBooksService);
        getUnreadBooksUIAction.execute();

        GetReadBooksService getReadBooksService = new GetReadBooksService(bookReader);
        GetReadBooksUIAction getReadBooksUIAction = new GetReadBooksUIAction(getReadBooksService);
        getReadBooksUIAction.execute();

    }


}
