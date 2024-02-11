package student_julija_raudive.lesson_10.level_2.UIAction;

import student_julija_raudive.lesson_10.level_2.Book;
import student_julija_raudive.lesson_10.level_2.BookDatabaseImpl;

class UIActionDemo {

     public static void main(String[] args) {

         BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

         SaveBookUIAction saveBook = new SaveBookUIAction(bookDatabase);
         saveBook.execute();
         System.out.println(bookDatabase);

         FindByIdUIAction findBook = new FindByIdUIAction(bookDatabase);
         findBook.execute();

         Book harryPotter1 = new Book("J. K. Rowling", "Harry Potter 1");
         Book harryPotter2 = new Book("J. K. Rowling", "Harry Potter 2");
         Book harryPotter3 = new Book("J. K. Rowling", "Harry Potter 3");
         Book theShining = new Book("Stephen King", "The Shining");
         Book it = new Book("Stephen King", "It");
         bookDatabase.save(harryPotter1);
         bookDatabase.save(harryPotter2);
         bookDatabase.save(harryPotter3);
         bookDatabase.save(theShining);
         bookDatabase.save(it);

         System.out.println(bookDatabase);

         FindByAuthorUIAction findByAuthor = new FindByAuthorUIAction(bookDatabase);
         findByAuthor.execute();

         FindByTitleUIAction findByTitle = new FindByTitleUIAction(bookDatabase);
         findByTitle.execute();

         DeleteByIdUIAction deleteById = new DeleteByIdUIAction(bookDatabase);
         deleteById.execute();
         System.out.println(bookDatabase);

         FindByTitleAndAuthorUIAction findByTitleAndAuthor = new FindByTitleAndAuthorUIAction(bookDatabase);
         findByTitleAndAuthor.execute();

         GetAuthorToBooksMapUIAction getAuthorToBooksMap = new GetAuthorToBooksMapUIAction(bookDatabase);
         getAuthorToBooksMap.execute();









     }
}
