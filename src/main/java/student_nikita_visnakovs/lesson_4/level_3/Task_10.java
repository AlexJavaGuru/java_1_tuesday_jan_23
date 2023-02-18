package student_nikita_visnakovs.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Enter three integers");
        Scanner scanner = new Scanner(System.in);
        int firstUserNum = scanner.nextInt();
        int secondUserNum = scanner.nextInt();
        int thirdUserNum = scanner.nextInt();

        if (firstUserNum > secondUserNum && firstUserNum > thirdUserNum) {
            System.out.println(firstUserNum);
        } else if (secondUserNum > firstUserNum && secondUserNum > thirdUserNum ) {
            System.out.println(secondUserNum);
        } else if ( thirdUserNum > secondUserNum && thirdUserNum > firstUserNum) {
            System.out.println(thirdUserNum);
        } else if ( firstUserNum == secondUserNum && firstUserNum == thirdUserNum) {
            System.out.println("All numbers are equal");
        } else if (firstUserNum == secondUserNum) {
            System.out.println("Fist and second integers are equal and bigger");
        } else if (secondUserNum == thirdUserNum) {
            System.out.println("Second and third integers are equal and bigger");
        } else {
            System.out.println("First and third integers are equal and bigger");
        }
    }
}
