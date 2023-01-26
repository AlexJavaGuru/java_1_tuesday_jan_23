package student_natalja_semitseva.lesson_2.level_2;

import java.util.Scanner;

public class task_2 {
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("number of seats in a row:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("number of rows");
        double secondDoubleNumber = scanner.nextDouble();
        double result = firstDoubleNumber * secondDoubleNumber;
        System.out.println(result);

        System.out.println("salary:");
        double threeDoubleNumber = scanner.nextDouble();
        System.out.println("expenses");
        double fourDoubleNumber = scanner.nextDouble();
        double resultDe = threeDoubleNumber - fourDoubleNumber;
        System.out.println(resultDe);

        System.out.println("amount books:");
        double tDoubleNumber = scanner.nextDouble();
        System.out.println("amount notebooks");
        double dDoubleNumber = scanner.nextDouble();
        double resultDek = tDoubleNumber + dDoubleNumber ;
        System.out.println(resultDek);

        System.out.println("amount:");
        double fiveDoubleNumber = scanner.nextDouble();
        System.out.println("person:");
        double sixDoubleNumber = scanner.nextDouble();
        double resultDev = fiveDoubleNumber / sixDoubleNumber;
        System.out.println(resultDev);

    }
}
