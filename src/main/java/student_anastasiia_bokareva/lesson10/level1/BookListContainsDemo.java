package student_anastasiia_bokareva.lesson10.level1;
import java.util.ArrayList;

public class BookListContainsDemo {

    public static void main(String[] args) {
        BookListContainsDemo test = new BookListContainsDemo();
        test.isOnTheList();
        test.isNotOnTheList();

    }

    public void isOnTheList(){
        BookListContainsDemo demo = new BookListContainsDemo();

        ArrayList <Book> books = new ArrayList<>();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        boolean realResult = demo.isInList(books,book1);
        boolean expectResult = true;
        check(expectResult,realResult,"is on the List");
    }

    public void isNotOnTheList(){
        BookListContainsDemo demo = new BookListContainsDemo();

        ArrayList <Book> books = new ArrayList<>();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        boolean realResult = demo.isInList(books,book2);
        boolean expectResult = false;
        check(expectResult,realResult,"is not on the List");
    }

    public boolean isInList(ArrayList<Book> books,Book book){
        if (books.contains(book)){
            return true;
        }
        return false;
    }
    public void check(boolean expected, boolean real, String testName){
        if (expected==real){
            System.out.println("Test "+ testName+ " is Ok");
        } else {
            System.out.println("Tets"+ testName + " is fail");
        }
    }
}
