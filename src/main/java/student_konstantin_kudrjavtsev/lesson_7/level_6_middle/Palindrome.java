package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

import java.util.Arrays;

class Palindrome {
    boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] charArray = text.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        return Arrays.equals(charArray, reversedArray);

    }
}