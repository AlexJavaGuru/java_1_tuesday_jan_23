package student_daniels_belejuns.lesson_9.level_5;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();

        test.addBook();
        test.notAddBook();
        test.delete();
        test.noBookToDelete();

    }
    public void addBook() {
        Book[] books = {
                new Book("Happy Place", "Emily Henry "),
                new Book("Fourth Wing ", "Rebecca Yarros"),
                new Book("Greenlights", "Matthew McConaughey"),
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.add(new Book("King of Wrath", "Ana Huang"));
        if (expectedResult == realResult) {
            System.out.println("Add book test Passed");
        }
    }

    public void notAddBook() {
        Book[] books = {
                new Book("Happy Place", "Emily Henry"),
                new Book("Fourth Wing ", "Rebecca Yarros"),
                new Book("Greenlights", "Matthew McConaughey"),
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.add(new Book("Fourth Wing", "Rebecca Yarros"));
        if (expectedResult == realResult) {
            System.out.println("Not add book test Passed");
        }
    }
    public void delete() {
        Book[] books = {
                new Book("Happy Place", "Emily Henry"),
                new Book("Fourth Wing ", "Rebecca Yarros"),
                new Book("Greenlights", "Matthew McConaughey"),
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.delete(new Book("Greenlights", "Matthew McConaughey"));
        if (expectedResult == realResult) {
            System.out.println("Delete book test Passed");
        }
    }
    public void noBookToDelete() {
        Book[] books = {
                new Book("Happy Place", "Emily Henry"),
                new Book("Fourth Wing ", "Rebecca Yarros"),
                new Book("Greenlights", "Matthew McConaughey"),
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.delete(new Book("Simply Lies", "David Baldacci"));
        if (expectedResult == realResult) {
            System.out.println("No book to delete test Passed");
        }
    }
}
