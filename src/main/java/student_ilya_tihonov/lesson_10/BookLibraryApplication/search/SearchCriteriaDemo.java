package student_ilya_tihonov.lesson_10.BookLibraryApplication.search;

public class SearchCriteriaDemo {


    public static void main(String[] args) {
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorCriteria, titleCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorCriteria, yearCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorCriteria, new OrSearchCriteria(yearCriteria, titleCriteria));

    }
}



