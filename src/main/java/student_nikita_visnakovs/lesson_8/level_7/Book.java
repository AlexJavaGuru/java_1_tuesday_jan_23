package student_nikita_visnakovs.lesson_8.level_7;


public class Book {

    private long id;
    private String author;
    private String title;
    private int releaseDate;
    private boolean isTaken;
    private int dateOfReturn;
    private Reader readerName;

    public Book(String author, String title, int releaseDate, long id) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
        this.id = id;
    }
}
