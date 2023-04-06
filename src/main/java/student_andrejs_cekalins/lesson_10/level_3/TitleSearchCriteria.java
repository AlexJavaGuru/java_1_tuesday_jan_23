package student_andrejs_cekalins.lesson_10.level_3;


import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().contains(titleToSearch);
    }
}
