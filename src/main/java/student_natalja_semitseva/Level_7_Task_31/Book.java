package student_natalja_semitseva.Level_7_Task_31;

public class Book extends Library{
    public Book(String name, String contact) {
        super(name, contact);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getContact() {
        return super.getContact();
    }

    @Override
    public void setContact(String contact) {
        super.setContact(contact);
    }

    @Override
    void takeABook(String author, String nameBook, int number) {
        super.takeABook(author, nameBook, number);
    }

    @Override
    void returnTheBook(String author, String nameBook, int number) {
        super.returnTheBook(author, nameBook, number);
    }

    @Override
    void bookSearch(String author, String nameBook, int number) {
        super.bookSearch(author, nameBook, number);
    }

    @Override
    void bookReservation(String author, String nameBook, int number) {
        super.bookReservation(author, nameBook, number);
    }

    @Override
    void sendingNotifications(String author, String nameBook, int BookReturnDate) {
        super.sendingNotifications(author, nameBook, BookReturnDate);
    }

    @Override
    void addBook(String author, String nameBook, int number) {
        super.addBook(author, nameBook, number);
    }
}
