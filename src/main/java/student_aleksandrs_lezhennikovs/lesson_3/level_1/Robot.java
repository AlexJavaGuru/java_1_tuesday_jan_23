package student_aleksandrs_lezhennikovs.lesson_3.level_1;


class Robot {

    String name;
    Robot(String robotName) {
        this.name = robotName;

    }
    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
