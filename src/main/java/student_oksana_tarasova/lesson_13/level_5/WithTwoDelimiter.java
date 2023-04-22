package student_oksana_tarasova.lesson_13.level_5;

public class WithTwoDelimiter extends StringWithDelimiter {
    String delimiter1;
   // String delimiter2;

    public WithTwoDelimiter(String delimiter1) {
        this.delimiter1 = delimiter1;
        //this.delimiter2 = delimiter2;
    }

    @Override
    String replaceAll(String numbers) {
        String numbersInput = numbers.replaceAll(delimiter1, ",");
        return numbersInput;
    }
}
