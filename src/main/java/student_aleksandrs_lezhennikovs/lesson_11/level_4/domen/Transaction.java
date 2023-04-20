package student_aleksandrs_lezhennikovs.lesson_11.level_4.domen;

 public class Transaction {

    private Trader trader;
    private int amount;

     public Transaction(Trader trader, int amount) {
         this.trader = trader;
         this.amount = amount;
     }

     public Trader getTrader() {
         return trader;
     }

     public int getAmount() {
         return amount;
     }

     @Override
     public String toString() {
         return "Transaction{\n" +
                 "trader=" + trader +
                 ", \namount=" + amount +
                 '}';
     }
 }
