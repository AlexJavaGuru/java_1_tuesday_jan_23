package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.BookDatabase;

class CountAllBooksUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        int bookAmount = bookDatabase.countAllBooks();
        System.out.println("Book amount in database: " + bookAmount);

     }
 }
