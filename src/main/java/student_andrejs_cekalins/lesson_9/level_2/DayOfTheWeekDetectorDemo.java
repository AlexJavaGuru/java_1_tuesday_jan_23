package student_andrejs_cekalins.lesson_9.level_2;


import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int number = scanner.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = dayOfTheWeekDetector.detectDayName(number);
        System.out.println("Detected day of the week is: " + dayOfTheWeek);
    }

    //DayOfTheWeekDetectorDemo(DayOfTheWeekDetector) {

}



