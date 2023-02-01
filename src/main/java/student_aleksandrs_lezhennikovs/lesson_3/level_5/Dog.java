package student_aleksandrs_lezhennikovs.lesson_3.level_5;

class Dog {

    String nickname;
    String color;
    int age;

    Dog(String nickname, String color, int age) {

        this.nickname = nickname;
        this.color = color;
        this.age = age;

    }

    void happyBirthday(){
        age++;
    }

    void voice() {

        System.out.println(nickname + " " + color + " " + age);
    }

}
