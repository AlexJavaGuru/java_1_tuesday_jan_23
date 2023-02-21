package student_vladislav_romanov.lesson_6.level_2;

class NumberUtilsTest {

    public static void main(String[] args) {
        isEvenTest();
    }

    public static void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean expected = true;
        boolean current = numberUtils.isEven(8);

        if (current == expected) {
            System.out.println("isEven test PASSED");
        } else {
            System.out.println("isEven test FAILED");
        }
    }

}
