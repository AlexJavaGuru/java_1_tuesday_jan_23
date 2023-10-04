package student_andrejs_cekalins.lesson_15.level_1;

public class WordsService {
    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
            }

}
