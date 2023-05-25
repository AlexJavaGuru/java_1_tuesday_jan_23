package student_anastasiia_bokareva.lesson10.level3;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

public class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria criteriaFirst;
    private SearchCriteria criteriaSecond;

    public AndSearchCriteria (SearchCriteria criteriaFirst,SearchCriteria criteriaSecond){
        this.criteriaFirst=criteriaFirst;
        this.criteriaSecond=criteriaSecond;
    }

    @Override
    public boolean match(Book book) {
        return criteriaSecond.match(book)&&criteriaFirst.match(book);
    }
}
