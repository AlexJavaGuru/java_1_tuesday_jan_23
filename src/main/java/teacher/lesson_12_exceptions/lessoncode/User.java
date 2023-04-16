package teacher.lesson_12_exceptions.lessoncode;

public class User {

    private String userName;
    private Department department;

    public User(String userName, Department department) {
        this.userName = userName;
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", department=" + department +
                '}';
    }
}
