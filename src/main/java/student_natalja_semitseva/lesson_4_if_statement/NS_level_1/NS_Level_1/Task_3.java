package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6- Saturday");
        System.out.println("7 - Sunday");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number 1-7:  ");
        int userInput = scanner.nextInt();


        switch (userInput) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such option");
        }

    }
}
