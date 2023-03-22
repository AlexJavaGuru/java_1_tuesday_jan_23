package student_oksana_tarasova.Lesson_9.level_5;

public class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.addTest();
        test.addTest2();
        test.addTest3();
        test.deleteTest();
        test.deleteTest1();
        test.printAllBooksTest();
        test.findAllBooksByTheAuthorTest();
        test.findAuthorByFirstLetterTest();
        test.findAuthorByFirstLetterTest1();
        test.findBooksByTitleTest();
        test.findBooksByTitleTest1();
        test.markABookAsReadTest();
        test.markABookAsReadTest1();
        test.markABookAsUnreadTest();
        test.markABookAsUnreadTest1();
        test.printBookAsReadTest1();
        test.printBookAsUnreadTest1();

    }

    public void addTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book(null, "Avers", "Guests of Baba Yaga", StateBook.STATE3));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book not title");

    }

    public void addTest2() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book("Marina", "Rakira", "Malina", StateBook.STATE3));
        boolean expectedResult = true;
        check(expectedResult == realResult, "Book added");

    }

    public void addTest3() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book  not added");

    }

    public void deleteTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.delete(new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3));
        boolean expectedResult = true;
        check(expectedResult == realResult, "Book  delete");

    }

    public void deleteTest1() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.delete(new Book("Kikj", "Kuklkl", "lkjj;", StateBook.STATE3));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book not  delete");
    }

    public void printAllBooksTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Avers", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.printAllBooks();
        String expectedResult = books[0].getTitle() + " [" + books[0].getSurnameAuthor() + "]\n" +
                books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n" +
                books[2].getTitle() + " [" + books[2].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "print all books");
    }

    public void findAllBooksByTheAuthorTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Kudryashov", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.findAllBooksByTheAuthor("Kudryashov");
        String expectedResult = books[0].getTitle() + " [" + books[0].getSurnameAuthor() + "]\n" +
                books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";

        check(realResult.equals(expectedResult), "find All Books By The Author");
    }

    public void findAuthorByFirstLetterTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Kudryashov", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.findAuthorByFirstLetter("olg");
        String expectedResult = books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "find the books of the author by the first letters of the name.");
    }

    public void findAuthorByFirstLetterTest1() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy", StateBook.STATE3),
                new Book("Olga", "Kudryashov", "Guests of Baba Yaga", StateBook.STATE3),
                new Book("Mariya", "Rashova", "On the streets of Istanbul", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.findAuthorByFirstLetter("kud");
        String expectedResult = books[0].getTitle() + " [" + books[0].getSurnameAuthor() + "]\n" +
                books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "find the books of the author by the first letters of the surname.");
    }

    public void findBooksByTitleTest() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.findBooksByTitle("sto");
        String expectedResult = books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "find book by title fragment");
    }

    public void findBooksByTitleTest1() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.findBooksByTitle("I am not");
        String expectedResult = books[3].getTitle() + " [" + books[3].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "find book by title");
    }
    public void markABookAsReadTest() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.markABookAsRead(books[1]);
        boolean expectedResult = true;
        check(realResult == expectedResult, "mark A Book As Read");
    }

    public void markABookAsReadTest1() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.markABookAsRead(new Book(" John", "White", "River", StateBook.STATE3));
        boolean expectedResult = false;
        check(realResult == expectedResult, "do not mark A Book As Read");
    }

    public void markABookAsUnreadTest() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.markABookAsUnread(new Book(" John", "White", "River", StateBook.STATE3));
        boolean expectedResult = false;
        check(realResult == expectedResult, "do not mark A Book As Unread");
    }

    public void markABookAsUnreadTest1() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.markABookAsUnread(books[0]);
        boolean expectedResult = true;
        check(realResult == expectedResult, "mark A Book As Unread");
    }
    public void printBookAsReadTest1() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        bookReaderImpl.markABookAsRead( new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3));
        bookReaderImpl.markABookAsRead(new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3));
        String realResult = bookReaderImpl.printBookAsRead(StateBook.STATE1);
        String expectedResult = books[0].getTitle() + " [" + books[0].getSurnameAuthor() + "]\n" +
                books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "print Book As Read");
    }

    public void printBookAsUnreadTest1() {
        Book[] books = {
                new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3),
                new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3),
                new Book("Valentina", "Oseeva", "Hozyayuska", StateBook.STATE3),
                new Book("Nikita", "Kudryashov", "I am not", StateBook.STATE3)
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        bookReaderImpl.markABookAsUnread( new Book("Nikita", "Kudryashov", "I am not God", StateBook.STATE3));
        bookReaderImpl.markABookAsUnread(new Book("Mihail", "Ilyin", "Sto tysyach pochemu", StateBook.STATE3));
        String realResult = bookReaderImpl.printBookAsUnread(StateBook.STATE2);
        String expectedResult = books[0].getTitle() + " [" + books[0].getSurnameAuthor() + "]\n" +
                books[1].getTitle() + " [" + books[1].getSurnameAuthor() + "]\n";
        check(realResult.equals(expectedResult), "print Book As Unread");
    }






    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
