package student_anastasiia_bokareva.lesson11.level1;

public class Safe2 {
    private int password;
    private int amountOfMoney;

    public int getPassword() {
        return password;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public Safe2(int password, int amountOfMoney) {
        this.password = password;
        this.amountOfMoney = amountOfMoney;
    }

    public void putNoney(int password, int additionalMoney) {
        if (this.password == password) {
            this.amountOfMoney += additionalMoney;
        }
    }

    public void getMoney(int password, int takenMonay) {
        if (this.password == password) {
            this.amountOfMoney -= takenMonay;
        }
    }
}
