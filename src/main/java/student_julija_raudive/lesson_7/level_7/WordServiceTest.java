package student_julija_raudive.lesson_7.level_7;



class WordServiceTest {

    student_julija_raudive.lesson_7.level_7.WordService test = new student_julija_raudive.lesson_7.level_7.WordService();

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWord();
        test.findMostFrequentWordIfTwoFrequentWords();

    }



    public void findMostFrequentWord(){
        String text = "daisy rose tulip rose orchid rose tulip";
        String resultWord = "rose";
        String word = test.findMostFrequentWord(text);
        checkResults(resultWord.equals(word), "Most frequent word from array test");

    }

    public void findMostFrequentWordIfTwoFrequentWords(){
        String text = "daisy tulip rose tulip rose orchid rose tulip";
        String resultWord = "tulip";
        String word = test.findMostFrequentWord(text);
        checkResults(resultWord.equals(word), "Two common words test");

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
