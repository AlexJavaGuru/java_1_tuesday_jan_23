package student_julija_raudive.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    WordService test = new WordService();

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.splitStringToArray();
        test.findMostFrequentWordFromArray();
        test.findMostFrequentWordFromArrayIfTwoFrequentWords();

        test.findMostFrequentWord();
    }

    public void splitStringToArray() {

        String[] arr = test.splitText("Rose daisy tUlip rose, orchid");
        String[] resultArr = {"rose", "daisy", "tulip", "rose", "", "orchid"};
        checkResults(Arrays.equals(arr, resultArr), "Split test");

    }

    public void findMostFrequentWordFromArray(){
        String[] arr = {"daisy", "rose", "tulip", "rose", "orchid", "rose", "tulip"};
        String resultWord = "rose";
        String word = test.findMostFrequentWordFromArray(arr);
        checkResults(resultWord.equals(word), "Most frequent word from array test");

    }

    public void findMostFrequentWordFromArrayIfTwoFrequentWords(){
        String[] arr = {"daisy", "tulip", "rose", "tulip", "rose", "orchid", "rose", "tulip",};
        String resultWord = "tulip";
        String word = test.findMostFrequentWordFromArray(arr);
        checkResults(resultWord.equals(word), "Two common words test");

    }

    public void findMostFrequentWord(){
        String word = test.findMostFrequentWord("Rose daisy tUlip rose, orchid");
        String resultWord = "rose";
        checkResults(resultWord.equals(word), "Most frequent word test");

    }



    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {

            System.out.println("OK");

        } else {
            System.out.println("FAIL");
        }

    }

}
