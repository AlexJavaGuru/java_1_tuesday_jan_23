package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

class BankAccount {
    private String ownerFirstName;
    private int moneyAmount;

    BankAccount(String ownerFirstName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }

    public void amountMoney() {
        System.out.println("amount of money: 100000 ");
    }

    public String getOwnerFirstName() {

        return this.ownerFirstName;
    }

    public int getMoneyAmount() {

        return this.moneyAmount;
    }
}