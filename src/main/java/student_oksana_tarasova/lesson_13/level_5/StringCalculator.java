package student_oksana_tarasova.lesson_13.level_5;

class StringCalculator {

    public int add(String numbers) throws NumberFormatException {
        String[] numberInput = numbers.replaceAll("[^0-9]", "").split("");
        int sum = 0;
        try {
            for (String number : numberInput) {
                if (number.equals("")) {
                    sum = 0;
                }
                    sum += Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
          // System.out.println("Entering numbers in text format \"one\" is not correct");
        }
        return sum;
    }
}
