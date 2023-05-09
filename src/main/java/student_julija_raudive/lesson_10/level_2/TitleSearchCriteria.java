package student_julija_raudive.lesson_10.level_2;

 public class TitleSearchCriteria implements SearchCriteria {
     private String titleToSearch;

     public TitleSearchCriteria(String titleToSearch) {
         this.titleToSearch = titleToSearch;
     }

     public boolean match(Book book) {
         return book.getTitle().contains(titleToSearch);
     }
}
