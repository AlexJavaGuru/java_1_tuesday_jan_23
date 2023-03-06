package student_oksana_tarasova.lesson_7.level_6;


class Palindrome {

    public boolean isPalindrome(String text) {
        String text1 = text.toLowerCase();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text1.charAt(i) != text1.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

