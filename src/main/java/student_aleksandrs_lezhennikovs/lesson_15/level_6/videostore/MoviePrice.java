package student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore;

public class MoviePrice {
    private String movieTitle;
    private double price;

    public MoviePrice(String movieTitle, double price) {
        this.movieTitle = movieTitle;
        this.price = price;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return movieTitle + " " + price;
    }
}
