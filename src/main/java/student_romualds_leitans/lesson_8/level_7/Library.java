package student_romualds_leitans.lesson_8.level_7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Reservation> reservations;
    private ArrayList<Fine> fines;
    private ArrayList<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.fines = new ArrayList<>();

    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Fine> getFines() {
        return fines;
    }

    public ArrayList<Book> searchBooks(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public void lendBook(Book book, User user, LocalDate dueDate) {

        Loan loan = new Loan(user, book,dueDate);
        loans.add(loan);
    }

    public void reserveBook(Book book, User user) {
        Reservation reservation = new Reservation(user, book);
        reservation.add(reservation);
    }

    public void returnBook(Book book, User user) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getUser().equals(user)) {
                loans.remove(loan);
                return;
            }
        }

    }




}
