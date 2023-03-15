package student_natalja_semitseva.NS_Lesson_7;


import java.util.Arrays;

public class WordServiceTest {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("is hel_*&o,My name Is is  Alex");
        System.out.println(result);




    }
    public void filterPunctuationAndSplit(){
        WordService wordService = new WordService();
        String text = "is hel_*&o,My name Is is  Alex";
        String expected = "is hello my name is is alex";
        String result = wordService.findMostFrequentWord(text);
        checkResults(expected,result, "filterPunctuationAndSplit");


    }
    private void findMaxWordCounter() {
        WordService wordService = new WordService();
        int[] wordCounter = {3, 1, 1, 3, 3, 1};
        int expected = 1;



    }

    public void checkResults(String expected, String result, String testName) {
        if (expected== result) {
            System.out.println(testName + " = TRUE");
        } else {
            System.out.println(testName + " = FALSE");

        }
    }
}
