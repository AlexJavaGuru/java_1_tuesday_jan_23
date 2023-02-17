package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_4_junior;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {

        return this.ownerFirstName;
    }

    String getOwnerLastName() {

        return this.ownerLastName;
    }

    int getMoneyAmount() {

        return this.moneyAmount;
    }
}