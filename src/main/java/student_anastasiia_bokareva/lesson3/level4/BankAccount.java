package student_anastasiia_bokareva.lesson3.level4;

 class BankAccount {
    String ownerFirstName;
    String ownerLastName;

    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return ownerFirstName;
    }

    String getOwnerLastName() {
        return ownerLastName;
    }

    Integer getMoneyAmount(){
        return moneyAmount;
    }
}
