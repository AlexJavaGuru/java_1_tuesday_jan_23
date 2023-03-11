package student_vladislav_romanov.lesson_7.level_7;

class WordServiceTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTestSucceed();
        wordServiceTest.findMostFrequentWordTestFailed();
        wordServiceTest.printStat();
    }

    public void findMostFrequentWordTestSucceed() {
        WordService wordService = new WordService();
        String text = "Java Is Programming Language Java helps us";
        String expectedMention = "Java";
        String currentMention = wordService.findMostFrequentWord(text);
        printResult(currentMention.equals(expectedMention), "findMostFrequentWordTestSucceed");
    }

    public void findMostFrequentWordTestFailed() {
        WordService wordService = new WordService();
        String text = "Java Is Programming Language Java helps us";
        String expectedMention = "is";
        String currentMention = wordService.findMostFrequentWord(text);
        printResult(!currentMention.equals(expectedMention), "findMostFrequentWordTestFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
