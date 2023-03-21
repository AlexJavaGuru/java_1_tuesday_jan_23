package student_natalija_rasponomarjova.lesson_7.level_1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.filterPunctuationAndSplitTest();

    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "Hello, name, darling, My name name name Name is IS Natalija";
        String fact = wordService.findMostFrequentWord(text);
        String expected = "name";
        testResult(fact.equals(expected));
    }

    public void filterPunctuationAndSplitTest() {
        WordService wordService = new WordService();
        String text = "Hello, name, darling, My name name name Name is IS Natalija";
        String[] expected = {"hello", "name", "darling", "my", "name", "name", "name", "name", "is", "is", "natalija"};
        String[] fact = wordService.filterPunctuationAndSplit(text);
        testResult(fact.equals(expected));
    }

    public void findMaxWordCounterTest() {
        WordService wordService = new WordService();


    }


    public void testResult(boolean condition) {
        if (condition) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}
