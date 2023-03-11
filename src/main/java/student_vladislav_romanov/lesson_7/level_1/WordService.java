package student_vladislav_romanov.lesson_7.level_1;

class WordService {

    private String[] split;
    private String maxMentionedWord;
    private int maxMentionedWordCounter = 0;
    private int counter = 0;

    public String findMostFrequentWord(String text) {
        splitString(text);
        countWordMentions();
        return getMaxMentionedWord();
    }

    public void splitString(String text) {
        setSplit(text.split("\\s|\\.\\s|,\\s|;\\s|\\.|,|;"));
    }

    public void countWordMentions() {
        iterateWordsArray();
    }

    public void iterateWordsArray() {
        for (String word: getSplit()) {
            iterateWordsArrayActions(word);
        }
    }

    public void iterateWordsArrayActions(String word) {
        setCounter(0);
        iterateWordsArrayAndCompareWithCurrentWord(word);
        compareWordMentionsWithCurrentMaxMentionedWordMentions(word);
    }

    public void iterateWordsArrayAndCompareWithCurrentWord(String word) {
        for (String nextWord: getSplit()) {
            compareWords(word, nextWord);
        }
    }

    public void compareWordMentionsWithCurrentMaxMentionedWordMentions(String word) {
        if (getCounter() > getMaxMentionedWordCounter()) {
            setMaxValues(getCounter(), word);
        }
    }

    public void compareWords(String word, String nextWord) {
        incrementCounter(word.equalsIgnoreCase(nextWord));
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

    public void setSplit(String[] split) {
        this.split = split;
    }

    public String[] getSplit() {
        return split;
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
