package student_vladislav_romanov.lesson_10.level_2_3;

public class SearchCriteriaDemo {

    public static void main(String[] args) {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Фенимор Купер");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Зверобой");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        Book thedeerslayer = new Book("Фенимор Купер", "Зверобой", "1890");

        System.out.println(new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria).match(thedeerslayer));
        System.out.println(new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria).match(thedeerslayer));
        System.out.println(new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria).match(thedeerslayer));
        System.out.println(new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria).match(thedeerslayer));
    }

}
