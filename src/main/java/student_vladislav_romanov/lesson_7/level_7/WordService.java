package student_vladislav_romanov.lesson_7.level_7;

class WordService {

    String[] textArray;
    int[] wordCountArray;

    public String findMostFrequentWord(String text) {
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];

        fillWordMentionsArray();

        return textArray[getMaxMentionedWordIndex()];
    }

    public void fillWordMentionsArray() {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            fillMaxMentionedWordIndex(wordCount, wordCounter);
            wordCounter = 0;
        }
    }

    public int getMaxMentionedWordIndex() {
        int index = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > index) {
                index = count;
            }
        }
        return index;
    }

    public void fillMaxMentionedWordIndex(int wordCount, int counter) {
        for (String s : textArray) {
            if (textArray[wordCount].equals(s)) {
                counter++;
            }
        }
        wordCountArray[wordCount] = counter;
    }


}
