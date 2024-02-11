package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;
import student_julija_raudive.lesson_10.level_2.UIAction.UIAction;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

     private BookDatabase bookDatabase;

     public SaveBookUIAction(BookDatabase bookDatabase) {
         this.bookDatabase = bookDatabase;
     }

     public void execute() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("new book title: ");
         String title = scanner.nextLine();
         System.out.print("new book author: ");
         String author = scanner.nextLine();
         System.out.print("Year of issue: ");
         String yearOfIssue = scanner.nextLine();
         Book newBook = new Book(author, title);
         bookDatabase.save(newBook);
         newBook.setYearOfIssue(yearOfIssue);
     }
}
