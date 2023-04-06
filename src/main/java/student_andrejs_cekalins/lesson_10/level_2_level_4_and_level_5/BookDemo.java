package student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5;



public class BookDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("J.R.R. Tolkien", "Lord of the Rings","2006");
        Book book1 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        System.out.println(bookDatabase);

        System.out.println(bookDatabase.delete(1L));

    }
}
