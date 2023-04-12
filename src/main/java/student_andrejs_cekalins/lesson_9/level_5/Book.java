package student_andrejs_cekalins.lesson_9.level_5;


class Book {
    private String bookTitle;
    private String author;
    private boolean read;
    private boolean unread;

    Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.read = false;
        this.unread = false;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setRead() {
        read = true;
    }

    public boolean getRead() {
        return read;
    }

    public void setUnread() {
        unread = true;
    }
}