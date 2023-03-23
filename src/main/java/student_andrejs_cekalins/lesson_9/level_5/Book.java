package student_andrejs_cekalins.lesson_9.level_5;

class Book {
    String bookName;
    String author;

    Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}
