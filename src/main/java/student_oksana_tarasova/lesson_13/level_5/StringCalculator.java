package student_oksana_tarasova.lesson_13.level_5;


class StringCalculator {

    StringWithDelimiter stringWithDelimiter;

    public StringCalculator(StringWithDelimiter stringWithDelimiter) {
        this.stringWithDelimiter = stringWithDelimiter;
    }

    public int add(String numbers) {
        stringWithDelimiter = new WithOneDelimiter(",");
        stringWithDelimiter = new WithThreeDelimiter(";", "&", "\\n");

        int sum = 0;

        String[] numberInput = stringWithDelimiter.replaceAll(numbers).split(",");
        try {
            for (String number : numberInput) {
                sum += Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            sum = 0;
            System.out.println("The string must start with a digit and contain only the specified delimiters");
        }
        return sum;
    }
}


