package student_oksana_tarasova.lesson_4.levet_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.year1();
        leapYearTest.year2();
        leapYearTest.year3();
        leapYearTest.nonLeapYear4();

    }

    public void outputResult(boolean state, String testName) {
        if (state) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    LeapYear leapYear = new LeapYear();

    public void year1() {
        outputResult(leapYear.year(1993).equals("Non-leap year"), "Не делиться на 4 - ОБЫЧНЫЙ ГОД");
    }

    public void year2() {
        outputResult(leapYear.year(2020).equals("Leap year"), "делиться на 4 и не делится  на 100 - ВИСОКОСНЫЙ ГОД");
    }

    public void year3() {
        outputResult(leapYear.year(2000).equals("Leap year"), "делится на 100 и 400 - ВИСОКОСНЫЙ ГОД");
    }

    public void nonLeapYear4() {
       outputResult(leapYear.year(1500).equals("Non-leap year"), "ДЕЛИТСЯ НА 100 И НЕ ДЕЛИТСЯ НА 400 - ОБЫЧНЫЙ ГОД");
    }
}
