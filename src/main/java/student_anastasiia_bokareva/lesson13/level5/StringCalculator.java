package student_anastasiia_bokareva.lesson13.level5;

public class StringCalculator {

    AdditionalRules rules;

    public StringCalculator(AdditionalRules rules){
        this.rules=rules;
    }

    public int add(String numbers) {
        rules = new AdditionalRules(",","\\n",";","&");
        int sum = 0;
        String[] numbersCell = rules.replace(numbers).split("[,\n]");
        try {
            for (String number : numbersCell) {
                sum += Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            System.out.println(sum);
        }
        return sum;
    }
}
