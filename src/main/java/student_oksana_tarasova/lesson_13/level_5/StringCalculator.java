package student_oksana_tarasova.lesson_13.level_5;

class StringCalculator {

    public int add(String numbers) {
        String[] numberInput = numbers.replaceAll("[^0-9]", "").split("");
        int sum = 0;
        try {
            for (String number : numberInput) {
                sum += Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            sum = 0;
        }
        return sum;
    }
}
