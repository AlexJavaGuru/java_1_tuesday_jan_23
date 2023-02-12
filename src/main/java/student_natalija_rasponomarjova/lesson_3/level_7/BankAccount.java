package student_natalija_rasponomarjova.lesson_3.level_7;

    class BankAccount {

       private String owner;
       private int money;

        BankAccount(String owner, int money) {
            this.owner = owner;
            this.money = money;

        }
        String getOwner() {
            System.out.println("The owner is " + " " + owner);
            return owner;
        }
     int getMoney() {
         System.out.println("Money amount is " +  " " + money);
         return money;
        }
    }



