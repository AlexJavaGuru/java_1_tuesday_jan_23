package student_dmitry_kupcus.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        System.out.println("Please input number to check in array: ");
        String arrayDayOfTheWeek = dayOfTheWeekDetectorArrayVersion.detectDayName(scanner.nextInt());
        System.out.println("Please input number to check in switch: ");
        String switchDayOfTheWeek = dayOfTheWeekDetectorSwitchVersion.detectDayName(scanner.nextInt());
        System.out.println("Please input number to check in if: ");
        String ifDayOfTheWeek = dayOfTheWeekDetectorIfVersion.detectDayName(scanner.nextInt());

        System.out.println("Array day of the week: " + arrayDayOfTheWeek);
        System.out.println("Switch day of the week: " + switchDayOfTheWeek);
        System.out.println("If day of the week: " + ifDayOfTheWeek);
    }
}
