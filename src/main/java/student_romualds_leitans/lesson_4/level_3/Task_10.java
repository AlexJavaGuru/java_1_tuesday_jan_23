package student_romualds_leitans.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number: ");
        int a = scanner.nextInt();
        System.out.print("Insert second number: ");
        int b = scanner.nextInt();
        System.out.print("Insert third number: ");
        int c = scanner.nextInt();

        if(a >= b && a >= c){
            System.out.println( a + " largest number");
        } else if (b >= a && b >= c){
            System.out.println( b + " largest number");
        } else if ( c >= a && c >= b){
            System.out.println( c + " largest number");
        }
    }
}
