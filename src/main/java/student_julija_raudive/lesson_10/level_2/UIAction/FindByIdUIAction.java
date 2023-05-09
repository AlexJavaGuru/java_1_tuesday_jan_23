package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {
     private BookDatabase bookDatabase;

     public FindByIdUIAction(BookDatabase bookDatabase) {
         this.bookDatabase = bookDatabase;
     }

     public void execute() {

         Scanner scanner = new Scanner(System.in);
         System.out.print("Book ID to find: ");
         Long id = scanner.nextLong();
         Optional<Book> bookOpt = bookDatabase.findById(id);
         if (bookOpt.isPresent()){
             System.out.println(bookOpt);
         }else{
             System.out.println("There is no book with this ID");
         }

     }
}
