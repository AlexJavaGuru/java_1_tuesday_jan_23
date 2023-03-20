package student_aleksandrs_lezhennikovs.lesson_9.level_5;

class BookReaderTest {
    public static void main(String[] args) {

    }

    private static void check(String actionName, String expect, String actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
