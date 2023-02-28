package student_julija_raudive.lesson_5.level_2;

import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        array[0] = scanner.nextInt();
        System.out.print("Enter the number: ");
        array[1] = scanner.nextInt();
        System.out.print("Enter the number: ");
        array[2] = scanner.nextInt();


        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

    }

}
