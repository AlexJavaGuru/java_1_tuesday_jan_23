package student_andrejs_cekalins.lesson_7.level_7.Task_15_16;

class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalCode;
    private UserEntity[] allUsers;

    UserEntity(int id, String name, String surname, int personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public UserEntity[] getAllUsers() {
        return allUsers;
    }
    public void deleteUser(int personalCode) {
        for (int i = 0; i < allUsers.length; i++) {
            if (personalCode ==allUsers[i].getPersonalCode()) {
                allUsers[i] =null;
            }
        }
    }
}
