package student_oksana_tarasova.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest();

    }

    public void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(9);
        boolean expectedResult = false;

        check(expectedResult == realResult, "isEven");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println( nameTest + "= ok");
        } else {
            System.out.println(nameTest + "= fail");
        }
    }
}
