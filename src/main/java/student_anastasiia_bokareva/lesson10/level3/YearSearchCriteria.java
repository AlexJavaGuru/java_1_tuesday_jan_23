package student_anastasiia_bokareva.lesson10.level3;


import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

public class YearSearchCriteria implements SearchCriteria {
    private String  year;

    public YearSearchCriteria(String year){
        this.year=year;
    }

    @Override
    public boolean match(Book book) {
        if  ( book.getYear().equalsIgnoreCase(this.year)){
            return true;
        }
        return false;
    }
}
