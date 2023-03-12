package student_oksana_tarasova.lesson_7.level_7;

class UserEntity {

    private long id;
    private long personalCode;
    private String name;
    private String surname;


    UserEntity(long id, String name, String surname, long personalCode) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", personalCode=" + personalCode +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}