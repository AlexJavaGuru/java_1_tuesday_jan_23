package student_anastasiia_bokareva.lesson10.level3;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level3.SearchCriteria;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }
    @Override
    public boolean match(Book book) {
        if (book.getAuthor().equalsIgnoreCase(authorToSearch)){
            return true;
        }
        return false;
    }
}
