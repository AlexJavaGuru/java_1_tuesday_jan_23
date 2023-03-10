package student_andrejs_cekalins.lesson_7.level_6.Task_11;

class Palindrome {
    boolean isPalindrome(String text) {
        String newText = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (text != null && text.length() > 0) {
            char[] chars = text.toCharArray();
            for (int i = 0; i < text.length() / 2; i++) {
                if (chars[i] != chars[text.length() - 1 - i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
