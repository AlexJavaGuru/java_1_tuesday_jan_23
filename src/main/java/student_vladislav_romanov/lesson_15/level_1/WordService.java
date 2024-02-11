package student_vladislav_romanov.lesson_15.level_1;

class WordService {

    public int countRepetitions(String[] words, String wordPattern) {
        int wordRepetitions = 0;
        for (String word : words) {
            if (word.equals(wordPattern)) {
                wordRepetitions++;
            }
        }
        return wordRepetitions;
    }

}
