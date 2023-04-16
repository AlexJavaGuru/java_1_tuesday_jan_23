package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

public class UnitTestBook {
    public static void main(String[] args) {
        UnitTestBook test = new UnitTestBook();
        test.checkAddWrongBook();
        test.checkAddBook();
        test.checkDiclineNewBook();

    }

    public void checkAddWrongBook(){
        BookReader book = new BookReaderImpl();
        Book books = new Book("Harry Potter", "HR");
        boolean realResult = book.addNewBook(books,"Harry Potter", "HR");
        boolean expectedResult = false;
        check(realResult,expectedResult,"wrong book");

    }
    public void checkAddBook(){
        BookReader book = new BookReaderImpl();
        Book books = new Book();
        books= new Book("Irehn", "HR");
        boolean realResult = book.addNewBook(books,"Harry Potter", "HR");
        boolean expectedResult = true;
        check(realResult,expectedResult,"add book");

    }

    public void checkDiclineNewBook(){
        BookReader book = new BookReaderImpl();

        ArrayList <books> = new Book("Harry Potter", "HR");
        books = new Book("Ireng","TRY");
        boolean realResult = book.addNewBook(books,"Harry Potter", "HR");
        boolean expectedResult = true;
        check(realResult,expectedResult,"add book");
    }

    public void check (boolean expectedResult, boolean realResult, String testName){
        if (expectedResult==realResult){
            System.out.println("Test "+ testName+ " is ok!");
        } else {
            System.out.println("Test "+ testName+ " is fail!");
        }
    }
}
