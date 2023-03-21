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
    }

    public void addTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book(null, "Avers", "Guests of Baba Yaga"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book not title");

    }

    public void addTest2() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book("Marina", "Rakira", "Malina"));
        boolean expectedResult = true;
        check(expectedResult == realResult, "Book added");

    }

    public void addTest3() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.add(new Book("Kirill", "Kudryashov", "How I Became a God. Billy"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book  not added");

    }

    public void deleteTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.delete(new Book("Kirill", "Kudryashov", "How I Became a God. Billy"));
        boolean expectedResult = true;
        check(expectedResult == realResult, "Book  delete");

    }

    public void deleteTest1() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult = bookReaderImpl.delete(new Book("Kikj", "Kuklkl", "lkjj;"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book not  delete");
    }

    public void printAllBooksTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        String realResult = bookReaderImpl.printAllBooks();
        String expectedResult = "How I Became a God. Billy [Kudryashov]\n" + "Guests of Baba Yaga [Avers]\n" + "On the streets of Istanbul [Rashova]";
        check(realResult.equals(expectedResult), "print all books");

    }


    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
