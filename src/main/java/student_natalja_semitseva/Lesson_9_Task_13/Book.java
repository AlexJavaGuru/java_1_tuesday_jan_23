package student_natalja_semitseva.Lesson_9_Task_13;


import java.util.ArrayList;
import java.util.List;

public class Book implements BookReader {
    String title;
    String author;
    boolean setRead;

    private static ArrayList<Book>books=new ArrayList<>();

    public Book(ArrayList<Book> books) {
        this.books = books;
    }


    public Book(String title, String author) {
        this.title=title;
        this.author=author;

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", setRead=" + setRead +
                '}';
    }

    @Override
    public boolean addBook(Book book) {
        boolean result = true;
        if (book.getTitle() == null || book.getAuthor() == null) {
            result = false;
        } else {
            for (Book b : books)
                if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                    result = false;
                    break;
                }
            if (result) {
                book.setRead(String.valueOf(false));
                books.add(book);
            }
        }


        return result;
    }

    @Override
    public void setRead(String book) {


    }

    @Override
    public void deleteBook() {

    }

    @Override
    public boolean deleteBook(Book book) {
        return false;
    }

    @Override
    public List<String> listOfAllBooks() {
        return List.of(new String[0]);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public void markAsRead(Book book) {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}

