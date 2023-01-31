package student_aleksandrs_lezhennikovs.lesson_3.level_5;

class Dog {

    String nickname;
    String dogsColor;
    int dogsAge;

    Dog(String name, String color, int age) {

        this.nickname = name;
        this.dogsColor = color;
        this.dogsAge = age;

    }

    void happyBirthday(){
        dogsAge++;
    }

    void voice() {

        System.out.println(nickname + " " + dogsColor + " " + dogsAge);
    }

}
