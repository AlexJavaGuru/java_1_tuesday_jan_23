package student_aleksandrs_lezhennikovs.lesson_10.level_2.task_6_7;

class BookDBDemo {
    public static void main(String[] args) {
        BookDatabase storage = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1");
        Book secondBook = new Book("A2", "B2");
        storage.saveBook(firstBook);
        storage.saveBook(secondBook);
        System.out.println(storage);
        storage.delete(1L);
        System.out.println(storage);
    }


}
