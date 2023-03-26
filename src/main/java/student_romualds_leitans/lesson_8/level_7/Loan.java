package student_romualds_leitans.lesson_8.level_7;

import java.time.LocalDate;

public class Loan {
    private User user;
    private Book book;
    private LocalDate dueDate;

    public Loan (User user, Book book, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }
        public User getUser () {
            return user;
        }

        public void setUser (User user){
            this.user = user;
        }

        public Book getBook () {
            return book;
        }

        public void setBook (Book book){
            this.book = book;
        }

        public LocalDate getDueDate () {
            return dueDate;
        }

        public void setDueDate (LocalDate dueDate){
            this.dueDate = dueDate;
        }

}