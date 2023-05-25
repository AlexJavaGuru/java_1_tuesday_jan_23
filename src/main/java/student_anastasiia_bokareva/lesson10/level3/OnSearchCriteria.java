package student_anastasiia_bokareva.lesson10.level3;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

public class OnSearchCriteria implements SearchCriteria{
    private SearchCriteria firstCriteria;
    private SearchCriteria secondCriteria;
    private SearchCriteria thirdCriteria;

   public OnSearchCriteria(SearchCriteria firstCriteria, SearchCriteria secondCriteria,SearchCriteria thirdCriteria){
        this.firstCriteria=firstCriteria;
        this.secondCriteria=secondCriteria;
        this.thirdCriteria=thirdCriteria;
    }
    @Override
    public boolean match(Book book) {
            return firstCriteria.match(book) || firstCriteria.match(book)||thirdCriteria.match(book);
    }
}
