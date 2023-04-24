package student_aleksandrs_lezhennikovs.lesson_13.level_5;

import java.util.Arrays;
import java.util.stream.IntStream;

class StringCalculator {
    int add(String numbers) {
        if (numbers.length() > 0) {
            numbers = numbers.replaceAll("[^0-9,\\n]+", "");
            if (numbers.contains(",") || numbers.contains("\n")) {
                String[] arrayString = numbers.split("[,\\n]");
                int[] arrayNumber = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
                int sum = IntStream.of(arrayNumber).sum();
                return sum;
            } else {
                return Integer.valueOf(numbers);
            }
        } else {
            return 0;
        }
    }
}
