package student_dmitry_kupcus.lesson_8.level_1;

class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private boolean female;

    DefaultConstructorV3(String fullName, int age, boolean male, Boolean female) {
        this.fullName = fullName;
        this.age = age;
        this.male = male;
        this.female = female;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return female;
    }


}