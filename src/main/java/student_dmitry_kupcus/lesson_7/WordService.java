package student_dmitry_kupcus.lesson_7;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = filterPunctuationAndSplit(text);
        int[] wordCounters = countEachWord(words);
        int indexOfMaxWord = findMaxWordCounter(wordCounters);
        return words[indexOfMaxWord];
    }

    static String[] filterPunctuationAndSplit(String text) {
        return text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }

    static int findMaxWordCounter(int[] wordCounters) {
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

    static int[] countEachWord(String[] words) {
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
