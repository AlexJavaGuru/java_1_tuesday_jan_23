package student_oksana_tarasova.Lesson_9.level_5;

public class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.addTest();
    }

    public void addTest() {
        Book[] books = {
                new Book("Kirill", "Kudryashov", "How I Became a God. Billy"),
                new Book("Olga", "Avers", "Guests of Baba Yaga"),
                new Book("Mariya", "Rashova", "On the streets of Istanbul")
        };
        BookReaderImpl bookReaderImpl = new BookReaderImpl(books);
        boolean realResult  = bookReaderImpl.add(new Book("Olga", "Avers", "Guests of Baba Yaga"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "Book not added");

    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
