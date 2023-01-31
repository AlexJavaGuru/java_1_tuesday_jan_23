package student_aleksandrs_lezhennikovs.lesson_3.level_4;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String FirstName,
                String LastName,
                int money) {
        this.ownerFirstName = FirstName;
        this.ownerLastName = LastName;
        this.moneyAmount = money;
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
