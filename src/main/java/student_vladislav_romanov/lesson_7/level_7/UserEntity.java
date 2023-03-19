package student_vladislav_romanov.lesson_7.level_7;

import java.util.Scanner;

class UserEntity {

    private int id;
    private String name;
    private String surname;
    private String personalCode;

    public UserEntity() {
    }

    public UserEntity(int id, String text) {
        this.id = id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter user name: " );
        name = scanner.next();

        System.out.print("Please enter user surname: ");
        surname = scanner.next();

        System.out.print("Please enter user personal code: ");
        personalCode = scanner.next();
    }

    public UserEntity(int id, String name, String surname, String personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public int getId() {
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

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalCode='" + personalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && name.equals(that.name) && surname.equals(that.surname) && personalCode.equals(that.personalCode);
    }
}
