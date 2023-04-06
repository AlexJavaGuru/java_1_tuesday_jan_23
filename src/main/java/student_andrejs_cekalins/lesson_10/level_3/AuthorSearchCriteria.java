package student_andrejs_cekalins.lesson_10.level_3;


import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().contains(authorToSearch);
    }
}
