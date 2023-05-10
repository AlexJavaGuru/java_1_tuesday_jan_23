package student_anastasiia_bokareva.lesson10.level3;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

public class TitleSearchCriteria implements SearchCriteria{
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.getTitle().equalsIgnoreCase(titleToSearch)){
            return true;
        }
        return false;
    }
}
