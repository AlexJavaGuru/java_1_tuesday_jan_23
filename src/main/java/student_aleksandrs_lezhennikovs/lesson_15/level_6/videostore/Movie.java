package student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore;

public class Movie {
    private String title;
    private Categories category;

    public Movie(String title, Categories category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}