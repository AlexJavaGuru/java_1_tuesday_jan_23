package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_28;

import java.util.Scanner;

class TempConverterDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input temperature");
        double tempToConvert = input.nextDouble();
        Context context = new Context(new CelsiusToKelvin());
        double result = context.executeTemperatureConverter(tempToConvert);
        System.out.println("Celsius to Kelvin " + tempToConvert + " = " + result);
    }
}
