package student_natalija_rasponomarjova.lesson_7.level_1;

import java.util.Arrays;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Hello, name, darling, My name name name Name is IS Natalija");
        System.out.println(result);
        System.out.println(Arrays.toString(wordService.filterPunctuationAndSplit
                ("Hello, name, darling, My name name name Name is IS Natalija")));

        int[]wordCounters = {1,5,1,1,2,1};
        System.out.println(wordService.findMaxWordCounter(wordCounters));
    }
}
