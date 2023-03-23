package student_anastasiia_bokareva.lesson7.level5;

import java.util.Scanner;

public class PowerCalculateTest {
    public static void main(String[] args) {
        PowerCalculateTest test = new PowerCalculateTest();
        int number = test.numberStrand();
        int degree = test.degreeStand();
        test.result(number,degree);



    }

    public int numberStrand(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a number = ");
        int number = scanner.nextInt();
        return number;
    }

    public int degreeStand(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a degree = ");
        int degree = scanner.nextInt();
        return degree;
    }

    public void result (int number, int degree){
        PowerCalculator calculator = new PowerCalculator();
        int resultOfCalculation = calculator.calculate(number,degree);
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
