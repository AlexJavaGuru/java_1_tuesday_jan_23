package student_natalija_rasponomarjova.lesson_3.level_5;

class Dog {

    String nickname;
    int age;
    String color;

    public Dog (String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    void getVoice() {

        System.out.println("Voice! " + nickname + " " + nickname + " " + nickname + " " + age + " " + "years" + " "
                + color);
    }
    void happyBirthday() {
        System.out.println((age = age + 1) + " " + "years");
    }
    void setColor (String color) {
        System.out.println(this.color = color);
    }
}

