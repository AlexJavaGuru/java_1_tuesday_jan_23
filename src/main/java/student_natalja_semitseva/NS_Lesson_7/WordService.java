package student_natalja_semitseva.NS_Lesson_7;




import java.util.Arrays;

public class WordService {

    public static String findMostFrequentWord(String text) {
        String[] words = filterPunctuationAndSplit(text);

        int[] wordCounters = countEachWord(words);
        System.out.println(Arrays.toString(wordCounters));
        int indexOfMaxWord = findMaxWordCounter(wordCounters);
        return words[indexOfMaxWord];

    }


    private static String[] filterPunctuationAndSplit(String text) {
        return text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

    }


    private static int findMaxWordCounter(int[] wordCounters) {

        int max = wordCounters[0];
        int indexOfMaxWord = 0;
        for (int i = 0; i < wordCounters.length; i++) {
            if (wordCounters[i] > max) {
                max = wordCounters[i];
                indexOfMaxWord = i;

            }
        }
        return indexOfMaxWord;

    }

    private static int[] countEachWord(String[] words) {
        int[] wordCounters = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for (String word : words) {
                if (word.equals(words[i])) {
                    counter++;
                }
            }

            wordCounters[i] = counter;


        }
        return wordCounters;


    }

}
