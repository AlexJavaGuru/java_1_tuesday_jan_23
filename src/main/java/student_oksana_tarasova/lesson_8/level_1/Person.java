package student_oksana_tarasova.lesson_8.level_1;

class Person extends Object {
    String name;
    String surname;
    String address;
    String nationality;
    String profession;

    public Person(int age, double height, boolean hunger, String name, String surname, String address, String nationality, String profession) {
        super(age, height, hunger);
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.nationality = nationality;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", profession='" + profession + '\'' +
                "} " + super.toString();
    }
}
