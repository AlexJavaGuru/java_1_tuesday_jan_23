package student_romualds_leitans.lesson_8.level_7;

public class Reservation {
    private User user;
    private Book book;

    public Reservation(User user, Book book){
        this.user = user;
        this.book = book;
    }
    public User getUser(){
        return user;
    }
    public Book getBook(){
        return book;
    }

    public void add(Reservation reservation) {
    }
}
