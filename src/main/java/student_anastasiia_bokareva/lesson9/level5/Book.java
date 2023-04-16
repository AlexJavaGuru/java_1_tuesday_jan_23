package student_anastasiia_bokareva.lesson9.level5;

public class Book {
    private  String bookTitle;
    private  String bookAuthor;


    Book(String bookTitle, String bookAuthor){
        this.bookTitle = bookTitle;
        this.bookAuthor=bookAuthor;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Book(){

    }

}
