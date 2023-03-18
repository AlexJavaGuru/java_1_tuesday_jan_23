package student_romualds_leitans.lesson_7.lesson_1;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService = new WordService();

        String text = "Play, drive, !Sleep!. eat, play? Sleep, jump, draw! SlEEP?";
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("Самое частое слово: " + mostFrequentWord);
    }

}
