package student_aleksandrs_lezhennikovs.lesson_7.level_1;

public class WordServiceDemo {

    public static void main(String[] args) {

        WordService wordService = new WordService();
        String text = "one two one two three five six two one six six six";
        System.out.println(wordService.findMostFrequentWord(text));
    }
}
