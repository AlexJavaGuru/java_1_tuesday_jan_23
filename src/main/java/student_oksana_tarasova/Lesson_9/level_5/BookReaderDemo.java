package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;

public class BookReaderDemo {
    public static void main(String[] args) {
        Book book = new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3);
        Book book1 = new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3);
        Book book2 = new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3);
        Book book3 = new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3);
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

       /* System.out.println(bookReaders.findAuthorByFirstLetter("kud"));
        System.out.println(bookReaders.findBooksByTitle("sto"));
        System.out.println(bookReaders.findBooksByTitle("Hozyayuska"));
        String[] string = book1.getTitle().split("\\s+");
        System.out.println(Arrays.toString(string));
        String[] string1 = book.getSurnameAuthor().split("");
        System.out.println(Arrays.toString(string1));
        System.out.println(bookReaders.findAuthorByFirstLetter("kud"));
        System.out.println(bookReaders.findAuthorByFirstLetter("mih"));
        System.out.println(bookReaders.toString());


        */

        bookReaders.markABookAsRead(book);
        bookReaders.markABookAsRead(book1);
        System.out.println(bookReaders.printBookAsRead(StateBook.STATE1));

        bookReaders.markABookAsUnread(book2);
        bookReaders.markABookAsUnread(book3);
        System.out.println(bookReaders.printBookAsUnread(StateBook.STATE2));

    }
}
