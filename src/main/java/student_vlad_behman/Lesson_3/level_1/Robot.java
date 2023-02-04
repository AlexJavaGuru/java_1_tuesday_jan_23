package student_vlad_behman.Lesson_3.level_1;

class Robot {
    public String name;

    Robot (String robotName){
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is: " + this.name);
    }

}
