package student_daniels_belejuns.lesson_3.level_5;

public class Dog {
    private String nickname;
    private int age;
    private String color;
    Dog (String nickname, int age, String color){
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public Dog(String nickname, int age) {
            this.nickname = nickname;
            this.age = age;
        }

    void happyBirthday(){
        age++;
    }
    void setColor(String color) {
        this.color = color;
    }
    void voice(){
        System.out.println(nickname + " " + color + " " + age );
    }
    public String getName() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
}


