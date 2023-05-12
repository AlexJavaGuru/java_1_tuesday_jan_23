package student_anastasiia_bokareva.lesson13.level5;

public class StringCalculator {
    String add(String numbers) {
        int sum = 0;
        if (numbers == "" && numbers==" ") {
            sum = 0;
        } else {
            String[] numbersCell = numbers.trim().split("\\s*,\\s*");
            if (numbersCell.length == 1) {
                sum = Integer.parseInt(numbersCell[0]);
            } else if (numbersCell.length == 2) {
                sum = Integer.parseInt(numbersCell[0]) + Integer.parseInt(numbersCell[1]);
            }
        }
        return Integer.toString(sum);
    }

}
