package student_julija_raudive.lesson_10.level_2;

 class SearchCriteriaDemo {

     public static void main(String[] args) {

         SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
         SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
         SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

         SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
         SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

         SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
         SearchCriteria searchCriteria4 = new OrSearchCriteria(searchCriteria3, yearOfIssueSearchCriteria);

     }
}
