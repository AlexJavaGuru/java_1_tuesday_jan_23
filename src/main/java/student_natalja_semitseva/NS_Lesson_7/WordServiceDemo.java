package student_natalja_semitseva.NS_Lesson_7;


import java.util.Arrays;

public class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("is hel_*&o,My name Is is  Alex");
        System.out.println(result);
    }

}

