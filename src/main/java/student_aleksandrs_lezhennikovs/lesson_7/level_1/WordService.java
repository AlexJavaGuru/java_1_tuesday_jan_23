package student_aleksandrs_lezhennikovs.lesson_7.level_1;

public class WordService {

    public String findMostFrequentWord(String text){
        String[] splitText = text.split(" ");
        int[] counterArray = makeArrayOfCounter(splitText);
        return splitText[indexOfMaxElementInArray(counterArray)];
    }

    public int[] makeArrayOfCounter(String[] string) {
        int[] counterArray = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            counterArray[i] = numberOfOccurrencesInArray(string, string[i]);
        }
        return counterArray;
    }

    public int numberOfOccurrencesInArray(String[] stringArray, String word) {
        int counter = 0;
        for (String text : stringArray) {
            if (word.equals(text)) {
                counter++;
            }
        }
        return counter;
    }

    public int indexOfMaxElementInArray(int[] numbers) {
        int result = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (result < numbers[i]) {
                result = numbers[i];
                index = i;
            }
        }
        return index;
    }

}
