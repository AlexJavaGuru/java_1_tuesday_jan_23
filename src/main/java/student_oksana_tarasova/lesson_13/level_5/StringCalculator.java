package student_oksana_tarasova.lesson_13.level_5;

class StringCalculator {

    public int add(String numbers) throws RuntimeException {
        String[] numberInput = numbers.replaceAll("[^0-9]", "").split("");
        int sum = 0;
        try {
            for (String number : numberInput) {
                if (number == "") {
                    sum = 0;
                } else {
                    sum += Integer.parseInt(number);
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Enter whole numbers...");
        }
        return sum;
    }
}
