package student_vladislav_romanov.lesson_7.level_1;

class WordService {

    private String maxMentionedWord = "";
    private int maxMentionedWordCounter = 0;
    private int counter = 0;

    public String findMostFrequentWord(String text) {
        countWordMentions(splitString(text));
        return getMaxMentionedWord();
    }

    public String[] splitString(String text) {
        return text.split("\\s|\\.\\s|,\\s|;\\s|\\.|,|;");
    }

    public void countWordMentions(String[] split) {
        iterateWordsArray(split);
    }

    public void iterateWordsArray(String[] split) {
        for (String word: split) {
            iterateWordsArrayActions(split, word);
        }
    }

    public void iterateWordsArrayActions(String[] split, String word) {
        setCounter(0);
        iterateWordsArrayAndCompareWithCurrentWord(split, word);
        compareWordMentionsWithCurrentMaxMentionedWordMentions(getCounter(), word);
    }

    public void iterateWordsArrayAndCompareWithCurrentWord(String[] split, String word) {
        for (String nextWord: split) {
            compareWords(word, nextWord);
        }
    }

    public void compareWordMentionsWithCurrentMaxMentionedWordMentions(int counter, String word) {
        if (counter > getMaxMentionedWordCounter()) {
            setMaxValues(counter, word);
        }
    }

    public void compareWords(String word, String nextWord) {
        incrementCounter(areWordsEqual(word, nextWord));
    }

    public boolean areWordsEqual(String word, String nextWord) {
        return word.equalsIgnoreCase(nextWord);
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter(boolean increment) {
        counter += increment ? 1: 0;
    }

    public void setMaxValues(int counter, String word) {
        setMaxMentionedWordCounter(counter);
        setMaxMentionedWord(word);
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
