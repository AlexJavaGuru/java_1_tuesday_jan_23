package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + bankAccount.owner);
        System.out.println("Money = " + bankAccount.money);
    }

}
