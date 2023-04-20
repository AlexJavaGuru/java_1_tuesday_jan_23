package student_aleksandrs_lezhennikovs.lesson_11.level_1.task_5;

import java.util.Scanner;

class SafeBox2vDemo {
    public static void main(String[] args) {
        SafeBox2v safeBox = new SafeBox2v(5000, 5478);
        System.out.println("Input withdraw sum and pin code:");
        Scanner input = new Scanner(System.in);
        int newDeposit = input.nextInt();
        int pinCode = input.nextInt();
        safeBox.setMoney(newDeposit, pinCode);
        System.out.println("To show your SafeBox current deposit input pin code");
        int pin = input.nextInt();
        System.out.println("SafeBox deposit: " + safeBox.getMoney(pin));
    }
}
