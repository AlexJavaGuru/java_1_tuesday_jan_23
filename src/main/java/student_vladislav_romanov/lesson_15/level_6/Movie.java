package student_vladislav_romanov.lesson_15.level_6;

import java.util.Objects;

class Movie {

	private String title;
	private MovieTypes priceCode;

	public Movie(String title, MovieTypes priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public MovieTypes getPriceCode() {
		return priceCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Movie movie = (Movie) o;
		return Objects.equals(title, movie.title) && Objects.equals(priceCode, movie.priceCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, priceCode);
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", priceCode='" + priceCode + '\'' +
				'}';
	}

}