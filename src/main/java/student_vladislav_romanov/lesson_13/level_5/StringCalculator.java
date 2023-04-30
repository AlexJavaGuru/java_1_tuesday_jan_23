package student_vladislav_romanov.lesson_13.level_5;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

    int add(String numbers) {
        String separator = "[\\n,]";
        int sum = 0;

        if (numbers.length() > 0) {
            String[] split = numbers.split(separator);
            Stream<String> stringStream = Arrays.stream(split);

            sum = stringStream.mapToInt(Integer::parseInt).sum();

        }

        return sum;
    }

}
