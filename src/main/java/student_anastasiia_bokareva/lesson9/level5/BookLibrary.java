package student_anastasiia_bokareva.lesson9.level5;

public class BookLibrary {
    private  String bookTitle;
    private  String bookAuthor;
    private int bookId;


    BookLibrary (String bookTitle, String bookAuthor, int bookId){
        this.bookTitle = bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookId=bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookId() {
        return bookId;
    }



    BookLibrary (){

    }

}
