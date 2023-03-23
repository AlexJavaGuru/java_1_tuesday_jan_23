package student_andrejs_cekalins.lesson_9.level_5;


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
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.add(new Book("Alice's Adventures in Wonderland","Lewis Carroll" ));
        if (expectedResult == realResult) {
            System.out.println("Add book test Passed");
        }
    }
    public void notAddBook() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.add(new Book("Lord of the Rings","J.R.R. Tolkien" ));
        if (expectedResult == realResult) {
            System.out.println("Not add book test Passed");
        }
    }
    public void delete() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.delete(new Book("Lord of the Rings","J.R.R. Tolkien" ));
        if (expectedResult == realResult) {
            System.out.println("Delete book test Passed");
        }
    }
    public void noBookToDelete() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        boolean realResult = bookReader.delete(new Book("Lord of the Rings","J.R.R. Tolkien" ));
        if (expectedResult == realResult) {
            System.out.println("No book to delete test Passed");
        }
    }



    /*public void addBook() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        Book book = new Book("Pinocchio", "Carlo Collodi");
        boolean realResult = bookReader.addBook(book,);
        if (expectedResult == realResult) {
            System.out.println("Add book test Passed");
        }
    }

    public void notAddBook() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        NewBook newBook = new NewBook("Don Quixote", "Miguel de Cervantes");
        boolean realResult = bookReader.addBook(newBook);
        if (expectedResult == realResult) {
            System.out.println("Not add book test Passed");
        }
    }

     */
}
