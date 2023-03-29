package student_andrejs_cekalins.lesson_7.level_7.Task_13;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];
        fillArrayWithFrequentWord(textArray, wordCountArray);
        int max = getMaxWord(wordCountArray);
        return textArray[max];
    }

    public void fillArrayWithFrequentWord(String[] textArray, int[] wordCountArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }

    public int getMaxWord(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }
}

