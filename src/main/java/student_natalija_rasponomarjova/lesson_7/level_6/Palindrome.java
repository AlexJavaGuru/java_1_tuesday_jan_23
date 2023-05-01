package student_natalija_rasponomarjova.lesson_7.level_6;

import java.util.Arrays;

class Palindrome {

    public boolean isPalindrome(String text) {
        char[] words = textToChar(text);
        char[] reversedWords = reverseArray(words);

        if (words.equals(reversedWords)) {
        }
        return true;
    }

    public char[] textToChar(String text) {
        String result = text.replaceAll("\\s+", "").toLowerCase();
        char[] words = result.toCharArray();
        return words;
    }

    public char[] reverseArray(char[] text) {
        char[] words = new char[text.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = text[words.length - 1 - i];
        }
        return words;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String text = "Искать Такси";
        char[] words1 = {'t', 'a', 'x','i' };

        System.out.println(palindrome.isPalindrome(text));
        System.out.println(Arrays.toString(palindrome.textToChar("такси")));
        System.out.println(Arrays.toString(palindrome.reverseArray(words1)));

    }
}
