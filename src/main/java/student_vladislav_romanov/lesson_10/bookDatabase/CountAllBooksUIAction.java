package student_vladislav_romanov.lesson_10.bookDatabase;

public class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("В библиотеке находится " + bookDatabase.countAllBooks() + " книг");
    }

}
