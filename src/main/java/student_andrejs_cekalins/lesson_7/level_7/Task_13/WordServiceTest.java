package student_andrejs_cekalins.lesson_7.level_7.Task_13;

import java.util.Objects;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordCheck();
    }

    public void findMostFrequentWordCheck() {
        WordService wordService = new WordService();
        String text = "Java lesson is lesson for learning java array at lesson";
        String expectedResult = "lesson";
        String realResult = wordService.findMostFrequentWord(text);
        checkResult(realResult,expectedResult, "Find most frequent word check test");
        System.out.println(realResult);
    }

    private void checkResult(String realResult, String expectedResult, String testName) {
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
