package student_ilya_tihonov.lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;

public class WordService {

    static String findMostFrequentWord(String text) {
            text = removePunctuation(text);
            text = text.toLowerCase();

            Map<String, Integer> wordCount = countWords(text);

            return findMaxCountWord(wordCount);
        }

        static String removePunctuation(String text) {
            return text.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        }

        static Map<String, Integer> countWords(String text) {
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : text.split("\\s+")) {
                Integer count = wordCount.get(word);
                if (count == null) {
                    count = 0;
                }
                wordCount.put(word, count + 1);
            }
            return wordCount;
        }

        static String findMaxCountWord(Map<String, Integer> wordCount) {
            int maxCount = 0;
            String mostFrequentWord = null;
            for (String word : wordCount.keySet()) {
                int count = wordCount.get(word);
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequentWord = word;
                }
            }
            return mostFrequentWord;
        }
    }




