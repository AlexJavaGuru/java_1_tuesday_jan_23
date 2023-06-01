package student_ilya_tihonov.lesson_13.level_5;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            String delimiterString = numbers.substring(2, delimiterEndIndex);
            delimiter = buildDelimiterRegex(delimiterString);
            numbers = numbers.substring(delimiterEndIndex + 1);
        }

        String[] nums = numbers.split(delimiter);
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    private String buildDelimiterRegex(String delimiterString) {
        StringBuilder regex = new StringBuilder();

        for (int i = 0; i < delimiterString.length(); i++) {
            char delimiterChar = delimiterString.charAt(i);
            if (Character.isLetterOrDigit(delimiterChar)) {
                regex.append("\\").append(delimiterChar);
            } else {
                regex.append(delimiterChar);
            }

            if (i != delimiterString.length() - 1) {
                regex.append("|");
            }
        }

        return regex.toString();
    }

}
