package student_aleksandrs_lezhennikovs.lesson_9.level_5;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.*;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.AddService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.DeleteService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.GetAllService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.SearchByAuthorService;
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




    }


}
