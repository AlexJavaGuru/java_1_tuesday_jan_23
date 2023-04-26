package student_aleksandrs_lezhennikovs.lesson_15.level_1;

class WordsService {
    public int countWordRepetitions(String[] words, String wordToCount) {
        int numberOfWordsToFound = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                numberOfWordsToFound++;
            }
        }
        return numberOfWordsToFound;
    }

}