package student_anastasiia_bokareva.lesson7.level1;

import java.util.Arrays;

public class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        int[] wordCounter = counterEachWord(words);
        int indexOfMaximum = findMostRepeatWord(wordCounter);
        return words[indexOfMaximum];

    }

    public int[] counterEachWord(String[] words) {
        int lenght = words.length;
        int[] wordCounter = new int[lenght];
        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for (String word : words) {
                if (word.equals(words[i])) {
                    counter++;
                }
            }
            wordCounter[i] = counter;
        }
        return  wordCounter;
    }

    public  int findMostRepeatWord(int[] wordCounter) {
        int max = wordCounter[0];
        int indexOfMax = 0;
        for (int i = 0; i < wordCounter.length; i++) {
            if (max < wordCounter[i]) {
                max = wordCounter[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}


