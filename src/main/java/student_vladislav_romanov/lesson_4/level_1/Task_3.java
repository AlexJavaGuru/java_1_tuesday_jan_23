package student_vladislav_romanov.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {

    static String dayOfWeek;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 7: ");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Введённое число не соответствует номеру дня недели";
                break;
        }

        System.out.println(dayOfWeek);
    }

}
