package student_andrejs_cekalins.lesson_9.level_5;

import java.util.Arrays;

public class BookDemo {
    public static void main(String[] args) {


        /*Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };        BookReader bookReader = new BookReaderImpl(books);
                System.out.println(bookReader.toString());


         */


        Book book = new Book("Don Quixote", "Miguel de Cervantes");
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        Book[] books = new Book[2];
        BookReader bookReader =new BookReaderImpl();
        bookReader.add(book1);
        System.out.println(bookReader.toString());




    }



}
