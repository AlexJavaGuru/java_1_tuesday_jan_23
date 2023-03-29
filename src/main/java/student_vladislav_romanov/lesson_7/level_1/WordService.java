package student_vladislav_romanov.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] split = splitString(text);
        String maxMentionedWord = "";
        int maxMentionedWordCounter = 0;

        for (String word: split) {
            int counter = 0;
            for (String nextWord: split) {
                counter += word.equalsIgnoreCase(nextWord) ? 1 : 0;
            }
            if (counter > maxMentionedWordCounter) {
                maxMentionedWord = word;
                maxMentionedWordCounter = counter;
            }
        }

        return maxMentionedWord;
    }

    public String[] splitString(String text) {
        return text.split("\\s|\\.\\s|,\\s|;\\s|\\.|,|;");
    }

}
