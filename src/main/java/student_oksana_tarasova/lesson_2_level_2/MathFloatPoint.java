package student_oksana_tarasova.lesson_2_level_2;

import java.util.Scanner;

public class MathFloatPoint {

        public static void main (String[] arg){

            Scanner scanner = new Scanner(System.in);
            double firstDoubleNumber = scanner.nextDouble();
            double secondDoubleNumber = scanner.nextDouble();

            double resultPlus = firstDoubleNumber + secondDoubleNumber;
            double resultMinus = firstDoubleNumber - secondDoubleNumber;
            double resultMultiply = firstDoubleNumber * secondDoubleNumber;
            double resultDivide = firstDoubleNumber / secondDoubleNumber;

            System.out.println(resultPlus);
            System.out.println(resultMinus);
            System.out.println(resultMultiply);
            System.out.println(resultDivide);
        }
}


