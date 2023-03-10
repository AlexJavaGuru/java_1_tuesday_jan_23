package student_daniels_belejuns.lesson_7.level_6.task_11;

public class isPalindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length / 2; i++) {
            if (textArray[i] != textArray[textArray.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
