package student_romualds_leitans.lesson_8.level_7;

public class Book {

    private String name;
    private String author;
    private String genre;
    private int rating;
    private int totalCopies;
    private boolean available;
    private String title;


    Book(String name, String author, String genre, int rating, int totalCopies,String title) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.totalCopies = totalCopies;
        this.available = true;
        this.title = title;

    }
    public String getTitle(){
        return title;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
