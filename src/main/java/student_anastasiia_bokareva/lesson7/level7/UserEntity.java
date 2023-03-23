package student_anastasiia_bokareva.lesson7.level7;

class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalNumber;

    UserEntity (int userId, String userName,String userSurname,int userPersonalNumber){
        this.id=userId;
        this.name=userName;
        this.surname=userSurname;
        this.personalNumber=userPersonalNumber;
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

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }
}
