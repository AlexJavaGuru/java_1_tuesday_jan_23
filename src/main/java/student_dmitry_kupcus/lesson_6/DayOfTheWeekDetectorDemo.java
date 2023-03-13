package student_dmitry_kupcus.lesson_6;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int dayNumber = dayOfTheWeekDetector.getDayNumberFromUser();
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
