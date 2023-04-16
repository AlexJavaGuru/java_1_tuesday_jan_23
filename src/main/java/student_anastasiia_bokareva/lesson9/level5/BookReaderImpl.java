package student_anastasiia_bokareva.lesson9.level5;

public class BookReaderImpl implements BookReader {

    @Override
    public boolean addNewBook(Book books, String bookName, String authorName) {
        if ((books.getBookTitle().equals(bookName))&&(books.getBookAuthor().equals(authorName))){
            return false;
        } else {
            BookLibrary library = new BookLibrary(100);
            library.addBook(new Book(bookName,authorName));
            return true;
        }
    }

}


