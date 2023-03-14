package student_aleksandrs_lezhennikovs.lesson_7.level_7;

class WordServiceTests {

    public static void main(String[] args) {

        String text = "one two two free free free four four four four";
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord(text);
        System.out.println(result);

    }
}
