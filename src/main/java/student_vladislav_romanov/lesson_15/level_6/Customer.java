package student_vladislav_romanov.lesson_15.level_6;

import java.util.*;

class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalOweAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental rental : rentals) {
			String movieTitle = rental.getMovie().getTitle();
			MovieTypes movieType = rental.getMovie().getPriceCode();
			int daysRented = rental.getDaysRented();

			double currentMovieOweAmount = calculateMovieOweAmount(movieType, daysRented);

			frequentRenterPoints = calculateFrequentRenterPoints(movieType, daysRented);

			result.append("\t").append(movieTitle).append("\t").append(currentMovieOweAmount).append("\n");
			totalOweAmount += currentMovieOweAmount;
		}

		result.append("You owed ").append(totalOweAmount).append("$\n");
		result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points\n");

		return result.toString();
	}

	public double calculateMovieOweAmount(MovieTypes movieType, int daysRented) {
		double amount = 0;

		switch (movieType) {
			case NEW_RELEASE -> amount += daysRented * 3;
			case CHILDREN -> {
				amount += 1.5;
				if (daysRented > 3) {
					amount += (daysRented - 3) * 1.5;
				}
			}
			default -> {
				amount += 2;
				if (daysRented > 2) {
					amount += (daysRented - 2) * 1.5;
				}
			}
		}

		return amount;
	}

	public int calculateFrequentRenterPoints(MovieTypes movieType, int daysRented) {
		return Objects.equals(movieType, MovieTypes.NEW_RELEASE) && daysRented > 1 ? 2 : 1;
	}

}