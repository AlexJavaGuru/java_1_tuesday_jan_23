package student_aleksandrs_lezhennikovs.lesson_10.level_4;

import java.util.Set;

public class UniqueWordsTest {
    public static void main(String[] args) {
        checkUniqueWords();
    }

    public static  void checkUniqueWords() {
        String text = "Create a set!@#$%^&*(){}[]:";
        UniqueWordsFinder uniqueWordsFinder = new UniqueWordsFinder();
        Set<String> result = uniqueWordsFinder.find(text);
        if (result.contains("Create") && result.contains("a") && result.contains("set") && result.size() == 3) {
            System.out.println("Unique words Test has PASSED!");
        } else {
            System.out.println("Unique words  Test has FAILED!");
        }
    }
}
