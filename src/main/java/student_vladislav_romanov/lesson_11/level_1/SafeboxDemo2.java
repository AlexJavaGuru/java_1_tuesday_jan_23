package student_vladislav_romanov.lesson_11.level_1;

public class SafeboxDemo2 {

    public static void main(String[] args) {
        Safebox2 safebox = new Safebox2(1234, 1000000);
        System.out.println("Money amount is " + safebox.getMoneyAmount());
        safebox.getMoney(1234, 60000);
        System.out.println("Money amount after withdraw 60000 is " + safebox.getMoneyAmount());
        safebox.putMoney(1243, 50000);
        safebox.putMoney(1234, 50000);
        System.out.println("Money amount after put 50000 is " + safebox.getMoneyAmount());
    }

}
