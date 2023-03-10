package student_oksana_tarasova.lesson_7.level_1;

import java.util.Arrays;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = textAsAnArrayWords(text);
        int[] countWord = repeatedWordsInText(words);
        String word = maxRepetition(countWord, words);
        return word;
    }

    public static String[] textAsAnArrayWords(String text) {
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        return words;
    }

    public static int[] repeatedWordsInText(String[] words) {
        int[] countWord = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (String repeat : words) {
                if (repeat.equals(words[i])) {
                    count++;
                }
            }
            countWord[i] = count;
        }
        return countWord;
    }

    public static String maxRepetition(int[] countWord, String[] words) {
        int count = countWord[0];
        int indexOfMaxWord = 0;
        for (int i = 0; i < countWord.length; i++) {
            if (countWord[i] > count) {
                count = countWord[i];
                indexOfMaxWord = i;
            }
        }
        return words[indexOfMaxWord];
    }
}
