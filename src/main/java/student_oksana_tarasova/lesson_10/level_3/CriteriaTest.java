package student_oksana_tarasova.lesson_10.level_3;

import student_oksana_tarasova.lesson_10.level_2.Book;

public class CriteriaTest {
    public static void main(String[] args) {
        CriteriaTest.authorSearch();
        CriteriaTest.authorSearch1();
        CriteriaTest.titleSearch();
        CriteriaTest.titleSearch1();
        CriteriaTest.yearSearch1();
        CriteriaTest.yearSearch();


    }

    public static void authorSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Ivanov");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (authorSearchCriteria.match(book) == false) {
            System.out.println("AuthorSearch is passed");
        } else {
            System.out.println("AuthorSearch is failed");
        }
    }

    public static void authorSearch1() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (authorSearchCriteria.match(book) == true) {
            System.out.println("AuthorSearch is passed");
        } else {
            System.out.println("AuthorSearch is failed");
        }
    }

    public static void titleSearch() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Kuper");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (titleSearchCriteria.match(book) == false) {
            System.out.println("TitleSearch is passed");
        } else {
            System.out.println("TitleSearch is failed");
        }
    }

    public static void titleSearch1() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (titleSearchCriteria.match(book) == true) {
            System.out.println("TitleSearch is passed");
        } else {
            System.out.println("TitleSearch is failed");
        }
    }

    public static void yearSearch() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (yearOfIssueSearchCriteria.match(book) == true) {
            System.out.println("YearSearch is passed");
        } else {
            System.out.println("YearSearch is failed");
        }
    }

    public static void yearSearch1() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1899");
        Book book = new Book("Zveroboi", "Kuper", "1890");
        if (yearOfIssueSearchCriteria.match(book) == false) {
            System.out.println("YearSearch is passed");
        } else {
            System.out.println("YearSearch is failed");
        }
    }
}
