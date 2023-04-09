package student_aleksandrs_lezhennikovs.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        checkSplitStringByWords();
        checkCounterArray();
        checkNumberOfOccurrencesInArray();
        checkIndexOfMaxInArray();
        checkFindMostFrequentWord();
    }

    public static String[] createSplitedArray() {
        String initialString = "one, two. one two three~!@#$%^&*() two_+- three;/ three{}|[]";
        return initialString.replaceAll("[^a-zA-Z ]", "").split(" ");
    }

    public static void checkSplitStringByWords() {
        System.out.println(Arrays.toString(createSplitedArray()));
    }

    public static void checkCounterArray() {
        WordService wordService = new WordService();
        String[] splitText = createSplitedArray();
        int[] expectedResult = {2, 3, 2, 3, 3, 3, 3, 3};
        int[] calculatedResult = wordService.makeArrayOfCounter(splitText);
        System.out.println(Arrays.toString(calculatedResult));
        check("Check array of counters ", expectedResult, calculatedResult);
    }
    public static void checkNumberOfOccurrencesInArray() {
        WordService wordService = new WordService();
        String[] splitText = createSplitedArray();
        int expectedResult = 3;
        int calculatedResult = wordService.numberOfOccurrencesInArray(splitText, "two");
        check("Check amount of occurrences in array for word six ", expectedResult, calculatedResult);
    }
    public static void checkIndexOfMaxInArray() {
        WordService wordService = new WordService();
        String[] splitText = createSplitedArray();
        int[] checkArray = wordService.makeArrayOfCounter(splitText);
        int expectedResult = 1;
        int calculatedResult = wordService.indexOfMaxElementInArray(checkArray);
        check("Check index of max element in array", expectedResult, calculatedResult);
    }

    public static void checkFindMostFrequentWord() {
        WordService wordService = new WordService();
        String initialString = "one two one two three two three three";
        String expectedResult = "two";
        String calculatedResult = wordService.findMostFrequentWord(initialString);
        check("Check find most frequent word method ", expectedResult, calculatedResult);
    }

    private static void check(String actionName, int expectedPrice, int actualCalculation) {
        if (expectedPrice == actualCalculation) {
            System.out.println(actionName + "test = OK");
        } else {
            System.out.println(actionName + "test = FAIL");
        }
    }

    private static void check(String actionName, int[] expectedResult, int[] actualCalculation) {
        if (Arrays.equals(expectedResult, actualCalculation)) {
            System.out.println(actionName + "test = OK");
        } else {
            System.out.println(actionName + "test = FAIL");
        }
    }

    private static void check(String actionName, String expectedResult, String actualCalculation) {
        if (expectedResult.equals(actualCalculation)) {
            System.out.println(actionName + "test = OK");
        } else {
            System.out.println(actionName + "test = FAIL");
        }
    }
}
