package student_vladislav_romanov.lesson_9.level_5;

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
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, 1258, 222, 152, "978-5-367-00360-4");

        System.out.println(implementation.addBook(shogun));
        System.out.println(implementation.addBook(shogun));
    }

}
