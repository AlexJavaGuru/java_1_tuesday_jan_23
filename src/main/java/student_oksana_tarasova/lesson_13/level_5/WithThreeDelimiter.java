package student_oksana_tarasova.lesson_13.level_5;

public class WithThreeDelimiter extends StringWithDelimiter {

    String delimiter1;
    String delimiter2;
    String delimiter3;


    public WithThreeDelimiter(String delimiter1, String delimiter2, String delimiter3) {
        this.delimiter1 = delimiter1;
        this.delimiter2 = delimiter2;
        this.delimiter3 = delimiter3;

    }

    @Override
    String replaceAll(String numbers) {
        String numbersString = numbers.replaceAll(delimiter1, ",").
                replaceAll(delimiter2, ",").
                replaceAll(delimiter3, ",");
        return numbersString;
    }
}
