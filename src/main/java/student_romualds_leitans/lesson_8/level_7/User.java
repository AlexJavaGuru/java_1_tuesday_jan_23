package student_romualds_leitans.lesson_8.level_7;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Book> borrowedBooks;
    private ArrayList<Book> reservedBooks;
    private ArrayList<Fine> fines;

    public User(String firstName,String lastName,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
        this.fines = new ArrayList<>();
    }
    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return  email;
    }
    public ArrayList<Book>getBorrowedBooks(){
        return borrowedBooks;
    }

    public ArrayList<Book>getReservedBooks(){
        return reservedBooks;
    }
    public ArrayList<Fine>getFines(){
        return fines;
    }

    public void addBook(Book book){
        borrowedBooks.add(book);
    }
    public void removeBook(Book book){
        borrowedBooks.remove(book);
    }


}






