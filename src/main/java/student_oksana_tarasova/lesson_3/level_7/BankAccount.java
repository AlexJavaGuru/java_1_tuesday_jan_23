package student_oksana_tarasova.lesson_3.level_7;

class BankAccount {
    String owner;
    int moneyAmount;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.moneyAmount;
    }

}

