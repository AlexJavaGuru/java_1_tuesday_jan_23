package student_vladislav_romanov.lesson_10.level_2_3;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().toLowerCase().contains(titleToSearch.toLowerCase());
    }

}
