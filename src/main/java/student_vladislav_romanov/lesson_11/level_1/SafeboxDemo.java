package student_vladislav_romanov.lesson_11.level_1;

public class SafeboxDemo {

    public static void main(String[] args) {
        Safebox safebox = new Safebox(1234, 1000000);
        System.out.println("Pin is " + safebox.pin);
        safebox.pin = 54321;
        System.out.println("New pin is " + safebox.pin);
        System.out.println("Amount is " + safebox.moneyAmount);
        safebox.moneyAmount = 50000;
        System.out.println("New amount is " + safebox.moneyAmount);
    }

}
