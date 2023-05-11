package student_andrejs_cekalins.lesson_15.level_6;

public class Rental {
    private final Movie movie;
  private final int daysRented;

    public Rental (Movie movie, int daysRented) {
        this.movie 		= movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
