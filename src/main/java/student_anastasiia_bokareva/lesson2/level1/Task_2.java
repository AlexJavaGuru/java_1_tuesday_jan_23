package student_anastasiia_bokareva.lesson2.level1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstDoubleNum = scan.nextDouble();
        char operation =  scan.next().charAt(0);
        double secondDoubleNum = scan.nextDouble();
        double result;
        char plus = '+';
        char minus = '-';
        char mnozenie = '*';
        char delenie = '/';

        if (operation == plus ) {
           result = firstDoubleNum+secondDoubleNum;
           System.out.println(result);
        }
        if (operation == minus) {
            result = firstDoubleNum-secondDoubleNum;
            System.out.println(result);
        }
        if (operation == mnozenie) {
            result = firstDoubleNum*secondDoubleNum;
            System.out.println(result);
        }
        if (operation == delenie) {
            result = firstDoubleNum/secondDoubleNum;
            System.out.println(result);
        }
    }
}
