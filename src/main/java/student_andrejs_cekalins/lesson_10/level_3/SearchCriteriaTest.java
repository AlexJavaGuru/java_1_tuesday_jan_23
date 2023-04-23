package student_andrejs_cekalins.lesson_10.level_3;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

public class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.authorToSearch();
        test.notAuthorToSearch();
        test.titleToSearch();
        test.notTitleToSearch();
        test.yearOfIssueToSearch();
        test.notYearOfIssueToSearch();
        test.andAuthorTitleToSearch();
        test.notAndAuthorTitleToSearch();
        test.andAuthorYearOfIssueToSearch();
        test.notAndAuthorYearOfIssueToSearch();
        test.orTitleYearOfIssueToSearch();
        test.notOrTitleYearOfIssueToSearch();
        test.orAuthorYearOfIssueToSearch();
        test.notOrAuthorYearOfIssueToSearch();
        test.orAuthorTitleToSearch();
        test.notOrAuthorTitleToSearch();
    }

    public void authorToSearch() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("J.R.R. Tolkien");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Author to search test Passed");
        }
    }

    public void notAuthorToSearch() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Miguel de Cervantes");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not author to search test Passed");
        }
    }

    public void titleToSearch() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("Lord of the Rings");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Title to search test Passed");
        }
    }

    public void notTitleToSearch() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("Don Quixote");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not title to search test Passed");
        }
    }

    public void yearOfIssueToSearch() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2006");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Year of issue to search test Passed");
        }
    }

    public void notYearOfIssueToSearch() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("2023");
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not year of issue to search test Passed");
        }
    }

    public void andAuthorTitleToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J.R.R. Tolkien");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Lord of the Rings");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Author and title to search test Passed");
        }
    }

    public void notAndAuthorTitleToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Miguel de Cervantes");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Lord of the Rings");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not author and title to search test Passed");
        }
    }

    public void andAuthorYearOfIssueToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J.R.R. Tolkien");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2006");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Author and year of issue to search test Passed");
        }
    }

    public void notAndAuthorYearOfIssueToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Miguel de Cervantes");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2023");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not author and year of issue to search test Passed");
        }
    }

    public void orTitleYearOfIssueToSearch() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Lord of the Rings");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2010");
        SearchCriteria searchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Title or year of issue to search test Passed");
        }
    }

    public void notOrTitleYearOfIssueToSearch() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Don Quixote");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1982");
        SearchCriteria searchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not title or year of issue to search test Passed");
        }
    }

    public void orAuthorYearOfIssueToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J.R.R. Tolkien");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2010");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Author or year of issue to search test Passed");
        }
    }

    public void notOrAuthorYearOfIssueToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Miguel de Cervantes");
        ;
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1982");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not author or year of issue to search test Passed");
        }
    }

    public void orAuthorTitleToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("J.R.R. Tolkien");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Don Quixote");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (expectedResult == realResult) {
            System.out.println("Author or title to search test Passed");
        }
    }

    public void notOrAuthorTitleToSearch() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Miguel de Cervantes");
        ;
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Don Quixote");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        boolean expectedResult = true;
        boolean realResult = searchCriteria.match(book1);
        if (!expectedResult == realResult) {
            System.out.println("Not author or title to search test Passed");
        }
    }
}
