package student_romualds_leitans.lesson_3.level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String NewOwner,int NewMoney) {
        this.owner = NewOwner;
        this.money = NewMoney;
    }
    void printBank (){
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        bankAccount.printBank();

    }

}