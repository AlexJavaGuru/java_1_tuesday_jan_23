package student_anastasiia_bokareva.lesson11.level1;

public class Safe {

    private int password;
    private int amountOfMoney;

    public int getPassword() {
        return password;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public Safe(int password, int amountOfMoney) {
        this.password = password;
        this.amountOfMoney = amountOfMoney;
    }

    public void addMoney(int additionalMoney) {
        this.amountOfMoney += additionalMoney;
    }

    public void changePassword(int newPassword) {
        this.password = newPassword;
    }


}
