package student_andrejs_cekalins.lesson_7.level_1.Task_1;

import student_andrejs_cekalins.lesson_7.level_1.Task_1.WordService;

class WordsServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String words =wordService.findMostFrequentWord("");
        System.out.println(words);
    }
}
