package student_julija_raudive.lesson_9.level_5;

class Book {


    String title;
    String author;
    boolean isRead;

    public boolean isRead() {
        return isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isRead = false;
    }
}
