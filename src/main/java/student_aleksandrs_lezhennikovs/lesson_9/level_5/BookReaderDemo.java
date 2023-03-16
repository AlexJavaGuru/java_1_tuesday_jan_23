package student_aleksandrs_lezhennikovs.lesson_9.level_5;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.AddUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.DeleteUIAction;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UIActions;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.AddService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.DeleteService;
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
        System.out.println(bookReader);
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");

        bookReader.add(secondBook);
        System.out.println(bookReader);

        BookEntity theSameBook = new BookEntity("Lāčplēsis", "Andrejs Pumpurs");

        bookReader.add(theSameBook);
        System.out.println(bookReader);

        BookEntity nullBook = new BookEntity(null, null);

        bookReader.add(nullBook);
        System.out.println(bookReader);

        BookEntity thirdBook = new BookEntity("Some title", "Some Author");

        bookReader.add(thirdBook);
        System.out.println(bookReader);

        /*bookReader.delete(theSameBook);
        System.out.println(bookReader);*/
        DeleteService deleteService = new DeleteService(bookReader);
        DeleteUIAction deleteUIAction = new DeleteUIAction(deleteService);
        deleteUIAction.execute();

        System.out.println(bookReader);

    }


}
