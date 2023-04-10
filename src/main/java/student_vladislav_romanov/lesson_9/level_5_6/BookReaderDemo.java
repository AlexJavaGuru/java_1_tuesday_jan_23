package student_vladislav_romanov.lesson_9.level_5_6;

class BookReaderDemo {

    private BookReader implementation;

    BookReaderDemo(BookReader implementation) {
        this.implementation = implementation;
    }

    public static void main(String[] args) {
        BookReaderDemo bookReaderV1 = new BookReaderDemo(new BookReaderImpl());

        bookReaderV1.run();
    }

    void run() {
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207,  "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");

        System.out.println(implementation.addBook(shogun));
        System.out.println(implementation.addBook(taipan));
    }

}
