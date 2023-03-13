package student_oksana_maksimova.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.ifNotDivBy4();
        leapYearTest.ifNotDivBy100();
        leapYearTest.ifNotDivBy400();
        leapYearTest.ifDivBy4AndNotDivBy100();
        leapYearTest.ifDivBy4AndDivBy100();
        leapYearTest.fDivBy4AndDivBy100AndNotDivBy400();
        leapYearTest.fDivBy4AndDivBy100AndDivBy400();
    }
    private void checkResult(boolean status, String testName){
        if (status){
            System.out.println(testName + "OK");
        }else {
            System.out.println(testName + "FAIL");
        }
    }
    private void ifNotDivBy4() {
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If not divided by 4 = ");
    }
    private void ifNotDivBy100() {
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If not divided by 100 = ");
    }
    private void ifNotDivBy400() {
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If not divided by 400 = ");
    }
    private void ifDivBy4AndNotDivBy100() {
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If divided by 4 and not divided by 100 = ");
    }
    private void ifDivBy4AndDivBy100() {
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If divided by 4 and divided by 100 = ");
    }
    private void fDivBy4AndDivBy100AndNotDivBy400(){
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If divided by 4, divided by 100 and not divided by 400 = ");
    }
    private void fDivBy4AndDivBy100AndDivBy400(){
        LeapYear leapYear = new LeapYear();
        checkResult(leapYear.isLeapYear(1524),"If divided by 4, divided by 100 and divided by 400 = ");
    }
}
