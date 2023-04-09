package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Account First Owner = " + ownerFirstName);
        bankAccount.amountMoney();
    }
}