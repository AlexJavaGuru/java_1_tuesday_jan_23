package student_natalija_rasponomarjova.lesson_6.level_2;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

    }
}

