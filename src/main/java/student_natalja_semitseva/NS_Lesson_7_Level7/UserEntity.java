package student_natalja_semitseva.NS_Lesson_7_Level7;

public class UserEntity {
    private long id;
    private String name;
    private String surname;
    private long personalCode;

    private UserEntity(int id, String name, String surname, int personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPersonalCode() {
        return personalCode;
    }

}
