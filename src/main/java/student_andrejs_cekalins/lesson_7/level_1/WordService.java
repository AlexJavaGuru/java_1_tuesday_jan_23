package student_andrejs_cekalins.lesson_7.level_1;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray = filterPunctuationAndSplit(text);
        int[] wordCounters = countEachWord(textArray);
        int indexOfMaxWord = findMaxWordCounter(wordCounters);
        return textArray[indexOfMaxWord];
    }

    // Array splitting from line to words:
    public String[] filterPunctuationAndSplit(String text) {
        return text.replaceAll("[^a-zA-Z\\- ]", " ").toLowerCase().split("\\s+");
    }

    // Counting each word. How meany times it is appearing in array:
    public int[] countEachWord(String[] textArray) {
        int[] wordCounters = new int[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < textArray.length; j++) {
                if (textArray[i].equals(textArray[j])) {
                    counter++;
                }
            }
            wordCounters[i] = counter;
        }
        return wordCounters;
    }

    // Counting index of word witch was appeared max times in the array
    public int findMaxWordCounter(int[] wordCounters) {
        int maxCount = wordCounters[0];
        int indexOfMaxWord = 0;
        for (int i = 0; i < wordCounters.length; i++) {
            if (wordCounters[i] > maxCount) {
                maxCount = wordCounters[i];
                indexOfMaxWord = i;
            }
        }
        return indexOfMaxWord;
    }
}
