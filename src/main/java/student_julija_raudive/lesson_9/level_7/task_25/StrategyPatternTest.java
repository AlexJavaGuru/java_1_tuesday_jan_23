package student_julija_raudive.lesson_9.level_7.task_25;

class StrategyPatternTest {

    public static void main(String[] args) {
        StrategyPatternTest test = new StrategyPatternTest();
        test.toLowerCaseTest();
        test.toUpperCaseTest();

    }

    public void toLowerCaseTest() {
        StringOperations stringOperations = new StringOperations(new ToLowerCaseString());
        String word = "HELlo";
        String expectedResult = "hello";
        String result = stringOperations.changeString(word);
        checkResults(result.equals(expectedResult), "Change to lower case test");

    }

    public void toUpperCaseTest() {
        StringOperations stringOperations = new StringOperations(new ToUpperCaseString());
        String word = "hello";
        String expectedResult = "HELLO";
        String result = stringOperations.changeString(word);
        checkResults(result.equals(expectedResult), "Change to upper case test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
