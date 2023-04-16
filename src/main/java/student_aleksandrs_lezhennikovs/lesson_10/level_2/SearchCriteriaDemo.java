package student_aleksandrs_lezhennikovs.lesson_10.level_2;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.*;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearch = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearch = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchAuthorAndTitle = new AndSearchCriteria(authorSearch, titleSearch);
        SearchCriteria yearSearch = new YearOfIssueSearchCriteria(1890);
        SearchCriteria searchAuthorAndYear = new AndSearchCriteria(authorSearch, yearSearch);
        SearchCriteria searchAuthorOrTitle = new OrSearchCriteria(authorSearch, titleSearch);
        SearchCriteria searchAuthorOrTitleOrYear = new OrSearchCriteria(searchAuthorOrTitle, yearSearch);
    }
}
