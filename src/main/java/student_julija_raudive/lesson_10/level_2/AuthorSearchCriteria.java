package student_julija_raudive.lesson_10.level_2;

 public class AuthorSearchCriteria implements SearchCriteria {
     private String authorToSearch;

     public AuthorSearchCriteria(String authorToSearch) {
         this.authorToSearch = authorToSearch;
     }

     public boolean match(Book book) {
         return book.getAuthor().contains(authorToSearch);
     }
 }
