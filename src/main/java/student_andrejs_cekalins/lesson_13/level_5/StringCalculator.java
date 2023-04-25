package student_andrejs_cekalins.lesson_13.level_5;

public class StringCalculator {
    public static int add(String numbers) {
        String delimiter = ",|;|&|\n";
        numbers = numbers.replaceAll("//|[\\p{Ps}\\p{Pe}]", "");
        int sum= 0;
        String[] numbersArray = numbers.split(delimiter);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
               sum+= Integer.parseInt(number.trim());
            }
        }
        return sum;
    }
}
