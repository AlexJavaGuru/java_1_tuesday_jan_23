package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_4_junior;

public class BankAccountDemo {
    public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }

    }