package student_vladislav_romanov.lesson_13.level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringCalculator {

    int add(String numbers) {
        int sum = 0;

        if (numbers.length() > 0) {
            String[] split = getNumbers(numbers);
            Stream<String> stringStream = Arrays.stream(split);
            sum = stringStream.map(this::cleaner).mapToInt(Integer::parseInt).sum();
        }

        return sum;
    }

    String getSeparators(String numbers) {
        List<String> separators = new ArrayList<>();
        separators.add("\n");
        separators.add(",");
        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find()) {
            separators.add(matcher.group(1));
        }

        return "[" + String.join("", separators) + "]";
    }

    String[] getNumbers(String numbers) {
        if (numbers.contains("//")) {
            String[] parts = numbers.split("\n", 2);
            return parts[1].split(getSeparators(parts[0]));
        }

        return numbers.split(getSeparators(numbers));
    }

    String cleaner(String number) {
        System.out.println(number);
        return number.replaceAll("\\D", "");
    }

}