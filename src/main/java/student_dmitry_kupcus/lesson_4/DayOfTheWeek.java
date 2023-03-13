package student_dmitry_kupcus.lesson_4;

import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Please enter number from 1 to 7");
            int number = scanner.nextInt();

            switch (number) {
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
                    System.out.println("Your number is lower then 1, or more then 7");
                    System.out.println("Exiting...");
                    isContinue = false;

            }

        }
    }
}
