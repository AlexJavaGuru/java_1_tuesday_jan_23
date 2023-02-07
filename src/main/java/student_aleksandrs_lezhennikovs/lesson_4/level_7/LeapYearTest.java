package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
    LeapYearTest testYear = new LeapYearTest();
        //1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600 not leap years
        System.out.println(testYear.check(1700, false));
        System.out.println(testYear.check(1800, false));
        System.out.println(testYear.check(1900, false));
        System.out.println(testYear.check(2100, false));
        System.out.println(testYear.check(2200, false));
        System.out.println(testYear.check(2300, false));
        System.out.println(testYear.check(2500, false));
        System.out.println(testYear.check(2600, false));

        //1600, 2000, 2400 leap years
        System.out.println(testYear.check(1600, true));
        System.out.println(testYear.check(2000, true));
        System.out.println(testYear.check(2400, true));

        //2004, 2008, 2016, 2020, 2024, 2028
        System.out.println(testYear.check(2004, true));
        System.out.println(testYear.check(2008, true));
        System.out.println(testYear.check(2016, true));
        System.out.println(testYear.check(2020, true));
        System.out.println(testYear.check(2024, true));
        System.out.println(testYear.check(2028, true));

        //2005, 2006, 2010, 2011, 2013
        System.out.println(testYear.check(2005, false));
        System.out.println(testYear.check(2006, false));
        System.out.println(testYear.check(2010, false));
        System.out.println(testYear.check(2011, false));
        System.out.println(testYear.check(2013, false));

    }

    String check(int year, boolean expectedResult) {
        LeapYear myYear = new LeapYear();
        boolean realResult = myYear.isLeapYear(year);
        if (realResult == expectedResult) {
            return "LeapYear test = OK for year " + year;
        } else {
            return "LeapYear test = FAIL for year " + year;
        }
    }


}
