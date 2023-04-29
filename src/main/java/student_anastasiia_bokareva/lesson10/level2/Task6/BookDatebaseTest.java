package student_anastasiia_bokareva.lesson10.level2.Task6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BookDatebaseTest {
    public static void main(String[] args) {
        BookDatebaseTest test = new BookDatebaseTest();
        test.checkDeleteById();

    }

    public void checkDeleteById() {
        BookDatabaseImpl impl = new BookDatabaseImpl();

        boolean deleteBook = impl.delete(1L);
        boolean checkResult = true;
        check(checkResult,deleteBook," delete book");

    }
    public void check (boolean expect, boolean realResult, String textName){
        if (realResult==expect){
            System.out.println("Test "+ textName+" is ok! ");
        } else {
            System.out.println("Test "+ textName+" is fail!");
        }
    }
}
