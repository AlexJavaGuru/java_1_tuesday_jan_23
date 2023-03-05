package student_vladislav_romanov.lesson_7.level_1;

class WordService {

    private String maxMentionedWord = "";
    private int maxMentionedWordCounter = 0;

    public String findMostFrequentWord(String text) {
        String[] split = splitString(text);
        countMentions(split);
        return getMaxMentionedWord();
    }

    public String[] splitString(String text) {
        return text.split("\\s|\\.\\s|,\\s|;\\s|\\.|,|;");
    }

    public void countMentions(String[] split) {
        for (String word: split) {
            int counter = 0;
            for (String word2: split) {
                if (word.equalsIgnoreCase(word2)) {
                    counter++;
                }
            }
            compareMentions(counter, word);
        }
    }

    public void compareMentions(int counter, String word) {
        if (counter > getMaxMentionedWordCounter()) {
            setMaxMentionedWordCounter(counter);
            setMaxMentionedWord(word);
        }
    }

    public void setMaxMentionedWordCounter(int maxMentionedWordCounter) {
        this.maxMentionedWordCounter = maxMentionedWordCounter;
    }

    public int getMaxMentionedWordCounter() {
        return maxMentionedWordCounter;
    }

    public void setMaxMentionedWord(String maxMentionedWord) {
        this.maxMentionedWord = maxMentionedWord;
    }

    public String getMaxMentionedWord() {
        return maxMentionedWord;
    }
}
