package student_anastasiia_bokareva.lesson2.level3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result;
        int i = 1;

        do {
            result = i * number;
            System.out.println(i + "*" + number + " = " + result);
            i = i + 1;
        }
        while (i < 11);

    }

}
