package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;

public class BookReaderDemo {
    public static void main(String[] args) {
        Book book = new Book("Nikita", "Kudryashov", "I am not God");
        Book book1 = new Book("Mihail", "Ilyin", "Sto tysyach pochemu");
        Book book2 = new Book("Valentina", "Oseeva", "Hozyayuska");
        Book book3 = new Book("Nikita", "Kudryashov", "I am not");
        Book[] books = new Book[1];
        BookReaderImpl bookReaders = new BookReaderImpl(books);
        System.out.println(bookReaders.toString());
        bookReaders.add(book);
        System.out.println(bookReaders.toString());
        bookReaders.add(book2);
        System.out.println(bookReaders.toString());
        bookReaders.add(book1);
        System.out.println(bookReaders.toString());
        bookReaders.add(book3);
        System.out.println(bookReaders.toString());
        System.out.println(bookReaders.findAuthorByFirstLetter("kud"));
        System.out.println(bookReaders.findBooksByTitle("sto"));
        System.out.println(bookReaders.findBooksByTitle("Hozyayuska"));
        String[] string = book1.getTitle().split("\\s+");
        System.out.println(Arrays.toString(string));
    }
}
