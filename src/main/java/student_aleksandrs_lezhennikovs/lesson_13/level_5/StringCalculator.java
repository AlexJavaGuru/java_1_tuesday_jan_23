package student_aleksandrs_lezhennikovs.lesson_13.level_5;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StringCalculator {

    public int add(String numbers) {
        List<String> delimiters = new ArrayList<>();
        delimiters.add(",");
        delimiters.add("\\n");
        if (numbers.length() > 0) {
            Pattern pattern = Pattern.compile("\\[(.*?)\\]");
            Matcher matcher = pattern.matcher(numbers);

            while (matcher.find()) {
                delimiters.add(matcher.group(1));

            }
            if (numbers.contains("[") && numbers.contains("]") && numbers.indexOf("[") < numbers.indexOf("]")) {
                numbers = StringUtils.substringAfter(numbers, "\n");
            }

            String excludeDelimitersFromGarbage = delimiters.stream()
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining());

            numbers = numbers.replaceAll("[^0-9" + excludeDelimitersFromGarbage + "]+", "");

            String[] arrayString = numbers.split("[" + excludeDelimitersFromGarbage + "]");
            int[] arrayNumber = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
            int sum = IntStream.of(arrayNumber).sum();
            return sum;
        } else {
            return 0;
        }
    }
}
