package student_oksana_tarasova.lesson_10.level_3;

import student_oksana_tarasova.lesson_10.level_2.Book;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Zveroboi", "Kuper", "1980");
        System.out.println(searchCriteria.match(book));

        SearchCriteria authorSearchCriteria4 = new AuthorSearchCriteria("Kup");
        SearchCriteria titleSearchCriteria4 = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria6 = new AndSearchCriteria(authorSearchCriteria4, titleSearchCriteria4);
        System.out.println(searchCriteria6.match(book));

        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1980");
        SearchCriteria titleSearchCriteria1 = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria1);
        System.out.println(searchCriteria1.match(book));

        SearchCriteria yearOfIssueSearchCriteria1 = new YearOfIssueSearchCriteria("1980");
        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Kuper");
        SearchCriteria searchCriteria2 = new AndSearchCriteria(yearOfIssueSearchCriteria1, authorSearchCriteria1);
        System.out.println(searchCriteria2.match(book));


        SearchCriteria yearOfIssueSearchCriteria2 = new YearOfIssueSearchCriteria("1980");
        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("Kup");
        SearchCriteria searchCriteria3 = new OrSearchCriteria(yearOfIssueSearchCriteria2, authorSearchCriteria2);
        System.out.println(searchCriteria3.match(book));

        SearchCriteria yearOfIssueSearchCriteria3 = new YearOfIssueSearchCriteria("1980");
        SearchCriteria titleSearchCriteria2 = new AuthorSearchCriteria("Zver");
        SearchCriteria searchCriteria4 = new OrSearchCriteria(yearOfIssueSearchCriteria3, titleSearchCriteria2);
        System.out.println(searchCriteria4.match(book));

        SearchCriteria authorSearchCriteria3 = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria3 = new AuthorSearchCriteria("Zver");
        SearchCriteria searchCriteria5 = new OrSearchCriteria(authorSearchCriteria3, titleSearchCriteria3);
        System.out.println(searchCriteria5.match(book));

    }
}
