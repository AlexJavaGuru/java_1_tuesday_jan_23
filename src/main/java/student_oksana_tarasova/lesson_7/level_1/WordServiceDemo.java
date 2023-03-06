package student_oksana_tarasova.lesson_7.level_1;

import java.util.Arrays;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService demo = new WordService();
        String text = "море волнуется раз море волнуется море";
        String[] words = demo.textAsAnArrayWords(text);
        System.out.println(Arrays.toString(words));
        System.out.println(demo.repeatedWordsInText(words));


    }
}
