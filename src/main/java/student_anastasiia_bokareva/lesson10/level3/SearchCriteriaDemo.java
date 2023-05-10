package student_anastasiia_bokareva.lesson10.level3;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book = new Book("Kuper","Zveroboi","1890");
        System.out.println(searchCriteria.match(book));

        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Kup");
        SearchCriteria yearSearchCriteria = new YearSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria1, yearSearchCriteria);
        Book book1 = new Book("Kup","Zveroboi","1890");
        System.out.println(searchCriteria1.match(book1));

        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearSearchCriteria2 = new YearSearchCriteria("1890");
        SearchCriteria titleSearchCriteria2 = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria2 = new OnSearchCriteria(authorSearchCriteria2,titleSearchCriteria2,yearSearchCriteria2);
        Book book2 = new Book("Kuper","Zveroboi","1890");
        System.out.println(searchCriteria2.match(book2));



    }
}
