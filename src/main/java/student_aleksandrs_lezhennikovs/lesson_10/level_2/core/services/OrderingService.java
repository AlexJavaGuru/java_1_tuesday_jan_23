package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;


import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.*;

public class OrderingService {

    public void ordering(String orderType, List<Book> booksToSort) {
        switch (orderType) {
            case "byTitle" -> booksToSort.sort(Comparator.comparing(Book::getTitle));
            case "byAuthor" -> booksToSort.sort(Comparator.comparing(Book::getAuthor));
            case "byYear" -> booksToSort.sort(Comparator.comparing(Book::getYearOfIssue));
        }

    }
}
