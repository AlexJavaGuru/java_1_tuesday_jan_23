package student_aleksandrs_lezhennikovs.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayDetect;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayDetect) {
        this.dayDetect = dayDetect;
    }

    String run() {
        return dayDetect.detectDayName(userInput());
    }

    int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of day");
        return input.nextInt();
    }

    void outputToConsole() {
        System.out.println(run());
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayDetectArrayImpl = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo detectDayArrayVersion = new DayOfTheWeekDetectorDemo(dayDetectArrayImpl);
        detectDayArrayVersion.outputToConsole();

        DayOfTheWeekDetector dayDetectIfImpl = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo detectDayIfVersion = new DayOfTheWeekDetectorDemo(dayDetectIfImpl);
        detectDayIfVersion.outputToConsole();

        DayOfTheWeekDetector dayDetectCaseImpl = new DayOfTheWeekDetectorCaseVersion();
        DayOfTheWeekDetectorDemo detectDayCaseVersion = new DayOfTheWeekDetectorDemo(dayDetectCaseImpl);
        detectDayCaseVersion.outputToConsole();

    }
}
