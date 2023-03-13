package teacher.lesson_8_inheritance.lessoncode.homeworkcheck;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Hell^^&*o, ALEX My name IS ALEX IS IS");
        System.out.println(result);
    }
}
