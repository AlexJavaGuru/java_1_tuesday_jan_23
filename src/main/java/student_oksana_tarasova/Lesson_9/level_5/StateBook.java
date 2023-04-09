package student_oksana_tarasova.Lesson_9.level_5;

public enum StateBook {
    STATE1 ("READ"),
    STATE2 ("NOT READ"),
    STATE3 ("NEW");

    private String state;

    StateBook(String state) {
        this.state = state;
    }


    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "StateBook{" +
                "state='" + state + '\'' +
                "} " + super.toString();
    }
}
