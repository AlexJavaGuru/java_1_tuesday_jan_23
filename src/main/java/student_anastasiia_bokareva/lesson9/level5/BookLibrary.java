package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

public class BookLibrary {
    private ArrayList<Book> books;
    public BookLibrary (int numbers){
        this.books = new ArrayList<Book>(numbers);
    }
    public void addBook (Book book){
        for (int i=0;i<this.books.toArray().length;i++){
            if (this.books.get(i) ==null){
                this.books.set(i, book);
                return;
            }
        }
    }
}
