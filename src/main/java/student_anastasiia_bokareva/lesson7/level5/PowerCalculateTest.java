package student_anastasiia_bokareva.lesson7.level5;

import java.util.Scanner;

public class PowerCalculateTest {
    public static void main(String[] args) {
        PowerCalculateTest test = new PowerCalculateTest();
        test.result();



    }

    public void result (){
        PowerCalculator calculator = new PowerCalculator();
        int resultOfCalculation = calculator.calculate(3,3);
        int expectedResult =27;
        check(resultOfCalculation,expectedResult," calculation ");

    }


    public void check (int realResult, int expectedResult, String testName){
        if (realResult==expectedResult){
            System.out.println("Test "+testName+ " is ok");
        } else {
            System.out.println("Test" + testName + " is fail");
        }
    }
}
