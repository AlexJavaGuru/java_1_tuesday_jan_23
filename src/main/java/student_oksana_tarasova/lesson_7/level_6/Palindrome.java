package student_oksana_tarasova.lesson_7.level_6;

class Palindrome {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s", "");
        char[] words = text.toLowerCase().toCharArray();
        for (int i = 0; i < words.length / 2; i++) {
            if (words[i] != words[words.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}


