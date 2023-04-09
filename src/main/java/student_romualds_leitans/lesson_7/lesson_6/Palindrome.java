package student_romualds_leitans.lesson_7.lesson_6;

import java.util.Arrays;

public class Palindrome {

    public static boolean isPalindrome(String text){
        char[] array = textToArray(text);
        char [] reverseArray = reverseArray(array);
        return Arrays.equals(array,reverseArray);
    }

    public  static  char[] textToArray(String text){
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return clean.toCharArray();
    }

    public static char[] reverseArray(char [] text){
        char [] array = new char[text.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = text[array.length -1 -i];
        }
        return array;

    }

}
