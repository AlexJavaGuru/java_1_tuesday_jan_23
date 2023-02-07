package student_daniels_belejuns.lesson_3.level_7;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        int moneyAmount = bankAccount.getMoney();
        String ownerFirstName = bankAccount.getOwner();
        System.out.println("owner = " + "Viktor");
        System.out.println("money = " + 100000);
    }

}
