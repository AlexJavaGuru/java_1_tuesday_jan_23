package student_romualds_leitans.lesson_8.level_7;

public class Fine {

    private User user;
    private int amount;

    public Fine(User user,int amount){
        this.user = user;
        this.amount = amount;
    }
    public User getUser(){
        return user;
    }

    public int getAmount(){
        return amount;
    }
}
