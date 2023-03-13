package student_aleksandrs_lezhennikovs.lesson_7.level_7;

class WordService {
    String findMostFrequentWord(String text) {

        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];
        fillOutCountArray(textArray, wordCountArray);
        int max = getMax(wordCountArray);

        return textArray[max];
    }

    void fillOutCountArray(String[] textArray, int[] wordCountArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String word : textArray) {
                if (textArray[wordCount].equals(word)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }
    int getMax(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }
}

