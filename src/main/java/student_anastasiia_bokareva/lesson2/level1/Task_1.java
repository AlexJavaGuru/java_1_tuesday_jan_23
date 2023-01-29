package student_anastasiia_bokareva.lesson2.level1;

import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        char z = scanner.next().charAt(0);
        int y = scanner.nextInt();

        switch(z) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
        }
    }

}


 

