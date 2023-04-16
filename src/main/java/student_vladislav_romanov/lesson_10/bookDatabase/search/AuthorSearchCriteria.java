package student_vladislav_romanov.lesson_10.bookDatabase.search;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().toLowerCase().contains(authorToSearch.toLowerCase());
    }

}
