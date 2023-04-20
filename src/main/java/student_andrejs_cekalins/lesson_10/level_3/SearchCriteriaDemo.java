package student_andrejs_cekalins.lesson_10.level_3;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1980");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria5 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book book = new Book("Kuper", "Zveroboi", "1980");


        System.out.println(searchCriteria1.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria3.match(book));
        System.out.println(searchCriteria4.match(book));
        System.out.println(searchCriteria5.match(book));
    }
}
