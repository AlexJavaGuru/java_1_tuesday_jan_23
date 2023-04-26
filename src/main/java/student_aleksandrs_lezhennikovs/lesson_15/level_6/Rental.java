package student_aleksandrs_lezhennikovs.lesson_15.level_6;


class Rental {

    private Movie movie;
    private int daysRented;

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