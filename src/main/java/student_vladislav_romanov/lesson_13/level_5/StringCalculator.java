package student_vladislav_romanov.lesson_13.level_5;

import java.util.regex.Pattern;

public class StringCalculator {

    String delimiter = ",";

    int add(String numbers) {
        int sum = 0;

        if (numbers.length() > 0) {
            Pattern pattern = Pattern.compile(delimiter);
            String[] split = pattern.split(numbers);

            for (String s : split) {
                sum += Integer.parseInt(s);
            }
        }

        return sum;
    }

}
