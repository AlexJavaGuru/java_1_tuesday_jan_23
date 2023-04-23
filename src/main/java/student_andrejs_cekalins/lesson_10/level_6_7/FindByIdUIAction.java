package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;
import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book Id to find a book: ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println("Book by entered Id number is: "+bookOpt);
    }
}
