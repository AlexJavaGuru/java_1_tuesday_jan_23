package student_romualds_leitans.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Insert First number: ");
        int num2 = scanner.nextInt();

        if ( num1 < num2 ) {
            System.out.println(num1 + " smallest number");
        } else if ( num1 > num2) {
            System.out.println( num2 + " smallest number");
            }
        }

    }

