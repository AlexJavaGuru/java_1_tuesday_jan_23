package student_natalija_rasponomarjova.lesson_7.level_1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.filterPunctuationAndSplitTest();
        System.out.println();
    }

    WordService wordService = new WordService();
    String text = "Hello, name, darling, My name name name Name is IS Natalija";

    public void findMostFrequentWordTest() {
        String fact = wordService.findMostFrequentWord(text);
        String expected = "name";
        testResult(fact.equals(expected));
    }

    public void filterPunctuationAndSplitTest() {
        String[] expected = {"hello name darling my name name name name is is natalija"};
        String[] fact = wordService.filterPunctuationAndSplit(text);
        testResult(fact.equals(expected));
    }

    public void testResult(boolean condition) {
        if (condition) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}
