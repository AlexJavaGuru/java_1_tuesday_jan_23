package student_konstantin_kudrjavtsev.lesson_1.level_1;

import java.util.Scanner;

public class QbandsTask_2 {
        public static void main(String[] args) {
            System.out.println("QbandsTask_2");

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter two real numbers");
            double firstDoubleNumber = scanner.nextDouble();
            double secondDoubleNumber = scanner.nextDouble();
            System.out.println(firstDoubleNumber + secondDoubleNumber);

            System.out.println("enter two real numbers");
            double thirdDoubleNumber = scanner.nextDouble();
            double fourDoubleNumber = scanner.nextDouble();
            System.out.println(thirdDoubleNumber - fourDoubleNumber);

            System.out.println("enter two real numbers");
            double fiveDoubleNumber = scanner.nextDouble();
            double sixDoubleNumber = scanner.nextDouble();
            System.out.println(fiveDoubleNumber * sixDoubleNumber);

            System.out.println("enter two real numbers");
            double sevenDoubleNumber = scanner.nextDouble();
            double eightDoubleNumber = scanner.nextDouble();
            System.out.println(sevenDoubleNumber - eightDoubleNumber);
        }
    }
