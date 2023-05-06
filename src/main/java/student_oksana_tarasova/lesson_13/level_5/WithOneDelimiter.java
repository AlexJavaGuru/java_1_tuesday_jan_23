package student_oksana_tarasova.lesson_13.level_5;


public class WithOneDelimiter extends StringWithDelimiter {

    String delimiter;

    public WithOneDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    String replaceAll(String numbers) {
        return numbers;
    }
}
