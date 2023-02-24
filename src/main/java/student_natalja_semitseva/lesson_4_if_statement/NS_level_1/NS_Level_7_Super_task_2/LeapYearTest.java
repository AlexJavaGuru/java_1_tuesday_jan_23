package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_7_Super_task_2;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();;

        leapYearTest.isLeapYear();
        leapYearTest.isDividedBy100();
        leapYearTest.isDividedBy400();

    }
    public void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(1987), "isDividedBy4");
        System.out.println("не делится на 4, значит он обычный");
    }
    public void isDividedBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(1988), "!isDividedBy100");
        System.out.println(true + " - обычный год \n" + true + " - високосный год только тот который делится также и на 400 \n" + false + " високосный год");
    }
    public void isDividedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(1988), "isDividedBy400");
        System.out.println( false + " - год обычный \n" +  true + "- високосный");
    }




    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = TRUE");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }

}

