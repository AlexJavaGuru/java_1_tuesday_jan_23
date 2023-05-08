package student_andrejs_cekalins.lesson_15.level_2.Task_9;

public class Trader {
    private String fullName;
    private String city;
    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
