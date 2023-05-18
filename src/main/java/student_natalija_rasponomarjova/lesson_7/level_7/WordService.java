package student_natalija_rasponomarjova.lesson_7.level_7;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        int[] wordCountArray = new int[words.length];
        fillOutCountArray(words, wordCountArray);
        int max = findMaxWordCounter(wordCountArray);
        return words[max];
    }

    void fillOutCountArray(String[] words, int[] wordCountArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < words.length; wordCount++) {
            for (String word : words) {
                if (words[wordCount].equals(word)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }

    int findMaxWordCounter(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }

}

