package student_aleksandrs_lezhennikovs.lesson_3.level_3;


class Robot {

    String name;
    Robot(String name) {
        this.name = name;

    }
    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
