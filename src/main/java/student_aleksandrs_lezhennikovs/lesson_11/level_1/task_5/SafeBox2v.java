package student_aleksandrs_lezhennikovs.lesson_11.level_1.task_5;

class SafeBox2v {
    private int deposit;
    private int pinCode;

    public SafeBox2v(int deposit, int pinCode) {
        this.deposit = deposit;
        this.pinCode = pinCode;
    }

    public int getMoney(int pinCode) {
        if (pinCode == this.pinCode) {
            return deposit;
        }
       return 0;
    }

    public void setMoney(int deposit, int pinCode) {
        if (pinCode == this.pinCode) {
            this.deposit = deposit;
        }
    }

}
