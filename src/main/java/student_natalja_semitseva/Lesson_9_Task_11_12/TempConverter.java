package student_natalja_semitseva.Lesson_9_Task_11_12;

import java.util.Scanner;

public class TempConverter {
    static Scanner scanner = new Scanner(System.in);

    // Method to convert Celsius to Fahrenheit
    static double C_F(double C) {
        double F = (C * 9 / 5) + 32;
        return F;
    }

    // Method to convert Celsius to Kelvin
    static double C_K(double C) {
        double K = C + 273.15;
        return K;
    }

    // Method to convert Fahrenheit to Celsius
    static double F_C(double F) {
        double C = (F - 32) * 5 / 9;
        return C;
    }

    // Method to convert Fahrenheit to Kelvin
    static double F_K(double F) {
        double K = (F - 32) * 5 / 9 + 273.15;
        return K;
    }

    // Method to convert Kelvin to Celsius
    static double K_C(double K) {
        double C = K - 273.15;
        return C;
    }

    // Method to convert Kelvin to Fahrenheit
    static double K_F(double K) {
        double F = (K - 273.15) * 9 / 5 + 32;
        return F;
    }

    // Method to read the value of temperature given by the user
    static double input(String word) {
        System.out.println("Enter " + word + " value:");
        double value = scanner.nextDouble();
        return value;
    }

    // Method to print converted value of temperature
    static void output(double val, String word) {
        System.out.printf("%s value: %.2f", word, val);
    }

    // Driver Method
    public void driverMethod() {

        System.out.println("1. Celsius to Fahrenheit\n2. Celsius to Kelvin\n" +
                "3. Fahrenheit to Celsius\n4. Fahrenheit to Kelvin\n" +
                "5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\n7. Exit");
        do {
            System.out.println("\nEnter Choice: ");
            int ch = scanner.nextInt();
            double num = 0;
            switch (ch) {
                case 1:
                    num = input("Celsius");
                    output(C_F(num), "Fahrenheit");
                    break;
                case 2:
                    num = input("Celsius");
                    output(C_K(num), "Kelvin");
                    break;
                case 3:
                    num = input("Fahrenheit");
                    output(F_C(num), "Celsius");
                    break;
                case 4:
                    num = input("Fahrenheit");
                    output(F_K(num), "Kelvin");
                    break;
                case 5:
                    num = input("Kelvin");
                    output(K_C(num), "Celsius");
                    break;
                case 6:
                    num = input("Kelvin");
                    output(K_F(num), "Fahrenheit");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (true);
    }

}
