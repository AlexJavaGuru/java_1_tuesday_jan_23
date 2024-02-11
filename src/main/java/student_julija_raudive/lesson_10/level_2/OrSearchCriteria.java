package student_julija_raudive.lesson_10.level_2;

 class OrSearchCriteria implements SearchCriteria {
     private SearchCriteria leftCondition;
     private SearchCriteria rightCondition;

     public OrSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
         this.leftCondition = leftCondition;
         this.rightCondition = rightCondition;
     }

     public boolean match(Book book) {
         return leftCondition.match(book) || rightCondition.match(book);
     }
}
