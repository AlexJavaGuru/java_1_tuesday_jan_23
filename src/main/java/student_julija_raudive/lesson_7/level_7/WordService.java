package student_julija_raudive.lesson_7.level_7;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] textArray;
        textArray = splitTextToArray(text);
        int max = findMostFrequentWordIndexFromArray(createWordCountArray(textArray));
        return textArray[max];

    }

    public String[] splitTextToArray(String text) {
        String[] textArray;
        textArray = text.split(" ");
        return textArray;
    }

    public int[] createWordCountArray(String[] textArray) {

        int[] wordCountArray;
        wordCountArray = new int[textArray.length];

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
        return wordCountArray;
    }

    public int findMostFrequentWordIndexFromArray(int[] wordCountArray) {

        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
       return max;

    }


}
