package student_anastasiia_bokareva.lesson9.level5;

import student_anastasiia_bokareva.lesson9.level4.UnitTest;

public class UnitTestBook {
    public static void main(String[] args) {
        UnitTestBook test = new UnitTestBook();
        test.checkAddWrongBook();

    }

    public void checkAddWrongBook(){

    }

    public void check (boolean expectedResult, boolean realResult, String testName){
        if (expectedResult==realResult){
            System.out.println("Test "+ testName+ " is ok!");
        } else {
            System.out.println("Test "+ testName+ " is fail!");
        }
    }
}
