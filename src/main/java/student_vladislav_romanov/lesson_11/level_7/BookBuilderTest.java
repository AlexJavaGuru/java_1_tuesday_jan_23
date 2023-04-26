package student_vladislav_romanov.lesson_11.level_7;

public class BookBuilderTest {

    public static void main(String[] args) {
        Book book = new Book.BookBuilder("Тай-пэн", "Джеймс Клавелл").setLanguage("русский").build();
        System.out.println(book);
    }

}