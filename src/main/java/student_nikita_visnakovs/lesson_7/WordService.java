package student_nikita_visnakovs.lesson_7;

import java.util.Locale;

public class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = createArrayOfWords(text);
        int[] countSameWords = countSameWords(words);
        return words[getMostFrequentWords(words, countSameWords)];
    }

    public String[] createArrayOfWords(String text) {
        String textToSplit = text.toLowerCase(Locale.ROOT);
        return textToSplit.split(" ");
    }

    public int[] countSameWords(String[] words) {
        int[] countOfSameWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] != null && words[i].equals(words[j])) {
                    words[j] = null;
                    count++;
                    countOfSameWords[i] = count;
                }
            }
        }
        return countOfSameWords;
    }

    public int getMostFrequentWords(String[] words, int[] countSameWords) {
        int indexOfMostFrequentWord = 0;
        int mostFrequentWord = 0;
        for (int i = 0; i < countSameWords.length; i++) {
            if (countSameWords[i] > mostFrequentWord) {
                mostFrequentWord = countSameWords[i];
                indexOfMostFrequentWord = i;
            }
        }
        return indexOfMostFrequentWord;
    }
}
