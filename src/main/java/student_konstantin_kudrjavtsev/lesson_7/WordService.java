package student_konstantin_kudrjavtsev.lesson_7;

import java.util.HashMap;


class WordService {

    public String findMostFrequentWord(String text) {
        // Разделяем текст на слова
        String[] words = text.split("\\s+");

        // Создаем хэшмап для хранения частоты каждого слова
        HashMap<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            if (wordFreq.containsKey(word)) {
                wordFreq.put(word, wordFreq.get(word) + 1);
            } else {
                wordFreq.put(word, 1);
            }
        }
        // Находим слово с наибольшей частотой
            int maxFreq = 0;
            String mostFreqWord = "";
            for (String word : wordFreq.keySet()) {
                int freq = wordFreq.get(word);
                if (freq > maxFreq) {
                    maxFreq = freq;
                    mostFreqWord = word;
                }
            }

            return mostFreqWord;
        }
    }