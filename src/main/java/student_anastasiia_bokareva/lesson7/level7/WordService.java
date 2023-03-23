package student_anastasiia_bokareva.lesson7.level7;

public class WordService {
    public String findMostFrequentWord(String text) {
        WordService word = new WordService();
        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];
        find(textArray,wordCountArray);
        int maximum = getMax(wordCountArray);
        return textArray[maximum];
    }

    void find (String[] textArray, int [] wordCountArray) {
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

    int getMax (int[] wordCountArray){
        int max = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }
}
