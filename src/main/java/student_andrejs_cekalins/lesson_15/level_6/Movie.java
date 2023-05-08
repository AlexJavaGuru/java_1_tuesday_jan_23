package student_andrejs_cekalins.lesson_15.level_6;

public class Movie {
    public static final String REGULAR = "REGULAR";
    public static final String NEW_RELEASE = "NEW_RELEASE";
    public static final String CHILDREN = "CHILDREN";

    private String title;
    private String priceCode;

    public Movie(String title, String priceCode) {
        this.title 		= title;
        this.priceCode = priceCode;
    }

    public String getTitle () {
        return title;
    }

    public String getPriceCode() {
        return priceCode;
    }
}
